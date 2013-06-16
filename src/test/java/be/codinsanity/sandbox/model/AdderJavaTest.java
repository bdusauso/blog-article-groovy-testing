package be.codinsanity.sandbox.model;

import be.codinsanity.sandbox.Adder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * author : Bruno Dusausoy
 */
@RunWith(Parameterized.class)
public class AdderJavaTest {

    private int operand1;
    private int operand2;
    private int sum;

    public AdderJavaTest(int operand1, int operand2, int sum) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.sum = sum;
    }

    @Test
    public void testAdd() {
        assertEquals(Adder.add(operand1, operand2), sum);
    }

    @Parameterized.Parameters(name = "Adding {0} and {1} should return {2}")
    public static Iterable<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                {1, 1, 2},
                {1, 2, 3},
                {2, 3, 5}
        });
    }
}
