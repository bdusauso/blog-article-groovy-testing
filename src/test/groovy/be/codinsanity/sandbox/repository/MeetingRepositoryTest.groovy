package be.codinsanity.sandbox.repository

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

    def "Findall should return "() {
        expect:
        assert meetingRepository.findAll() != null
    }
}
