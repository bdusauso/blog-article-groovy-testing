package be.codinsanity.sandbox.model

import be.codinsanity.sandbox.Adder
import spock.lang.Specification
import spock.lang.Unroll

/**
 * author : Bruno Dusausoy
 */
class AdderGroovyTest extends Specification {

    @Unroll
    def "Adding #operand1 and #operand2 should return #sum"() {
        expect:
            Adder.add(operand1, operand2) == sum

        where:
            operand1    | operand2  || sum
            1           | 1         || 2
            1           | 2         || 3
            2           | 3         || 5
    }
}
