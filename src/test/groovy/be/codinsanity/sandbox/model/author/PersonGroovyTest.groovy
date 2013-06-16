package be.codinsanity.sandbox.model.author

import org.joda.time.DateMidnight
import org.junit.Test

/**
 * author : Bruno Dusausoy
 */
class PersonGroovyTest {

    @Test
    void testEquals() {
        def p1 = new Person(
                firstname: 'Bruno',
                lastname: 'Dusausoy',
                email: 'bdusauso@foo.com',
                birthDate: new DateMidnight(1980, 8, 26),
                addresses: [
                        new Person.Address(
                                street: 'Jump Street 21',
                                zipCode: '6666',
                                city: 'Los Angeles',
                                country: 'United States of America')
                ] as Set
        )

        def p2 = new Person(
                firstname: 'John',
                lastname: 'Doe',
                email: 'john@doe.com',
                birthDate: new DateMidnight(1975, 1, 2),
                addresses: [
                        new Person.Address(
                                street: 'Jump Street 22',
                                zipCode: '6666',
                                city: 'Los Angeles',
                                country: 'United States of America')
                ] as Set
        )

        assert p1 != p2
    }
}
