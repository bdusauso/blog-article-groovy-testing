package be.codinsanity.sandbox;

import be.codinsanity.sandbox.model.Meeting;
import be.codinsanity.sandbox.repository.MeetingRepository;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * author : Bruno Dusausoy
 */
@ContextConfiguration("classpath:/META-INF/spring/applicationContext-main.xml")
public class ApplicationTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private MeetingRepository meetingRepository;

    @Test
    public void testFInd() {
        List<Meeting> meetings = meetingRepository.findAll();
        assertThat(meetings.size(), is(equalTo(0)));
    }
}
