package be.codinsanity.sandbox.model.author;

import org.joda.time.DateMidnight;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * author : Bruno Dusausoy
 */
public class PersonJavaTest {

    @Test
    public void testEquals() {

        Person p1 = new Person();
        p1.setFirstname("Bruno");
        p1.setLastname("Dusausoy");
        p1.setBirthDate(new DateMidnight(1980, 8, 26));
        p1.setEmail("bdusauso@foo.com");

        Person.Address a1 = new Person.Address();
        a1.setStreet("Jump Street 21");
        a1.setZipCode("6666");
        a1.setCity("Los Angeles");
        a1.setCountry("United States of America");

        p1.getAddresses().add(a1);

        Person p2 = new Person();
        p2.setFirstname("John");
        p2.setLastname("Doe");
        p2.setBirthDate(new DateMidnight(1975, 1, 2));
        p2.setEmail("john@doe.com");

        Person.Address a2 = new Person.Address();
        a2.setStreet("Jump Street 22");
        a2.setZipCode("6666");
        a2.setCity("Los Angeles");
        a2.setCountry("United States of America");

        p2.getAddresses().add(a2);

        assertThat(p2, not(equalTo(p1)));
    }
}
