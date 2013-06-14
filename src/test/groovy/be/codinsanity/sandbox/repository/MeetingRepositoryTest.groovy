package be.codinsanity.sandbox.repository

import org.dbunit.DataSourceDatabaseTester
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder
import org.dbunit.operation.DatabaseOperation
import org.junit.Before
import org.springframework.core.io.ClassPathResource
import org.springframework.test.context.ContextConfiguration
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

import javax.annotation.Resource
import javax.sql.DataSource

/**
 * author : Bruno Dusausoy
 */
@ContextConfiguration("classpath:/META-INF/spring/applicationContext-main.xml")
@Transactional
class MeetingRepositoryTest extends Specification {

    @Resource
    MeetingRepository meetingRepository

    @Resource
    DataSource dataSource

    def "FindOne should return an existing entity"() {
        expect:
        meetingRepository.findOne(id) != null

        where:
        id << [1L, 2L, 3L]
    }

    @Before
    def setup() {
        def databaseTest = new DataSourceDatabaseTester(dataSource)
        def resource = new ClassPathResource("be/codinsanity/sandbox/repository/meeting/search.xml")
        def dataset = new FlatXmlDataSetBuilder().build(resource.getInputStream());
        databaseTest.setDataSet(dataset)
        def dbConnection = databaseTest.getConnection()
        DatabaseOperation.CLEAN_INSERT.execute(dbConnection, dataset)
    }
}
