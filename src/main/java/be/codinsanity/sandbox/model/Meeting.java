package be.codinsanity.sandbox.model;

/**
 * author : Bruno Dusausoy
 */

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table(name = "T_MEETINGS")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
    @Column(name = "START_DATE_TIME")
    private DateTime start;

    @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
    @Column(name = "END_DATE_TIME")
    private DateTime end;

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }
}
