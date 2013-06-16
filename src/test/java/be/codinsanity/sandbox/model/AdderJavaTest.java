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

    private int firstInteger;
    private int secondInteger;
    private int result;

    public AdderJavaTest(int firstInteger, int secondInteger, int result) {
        this.firstInteger = firstInteger;
        this.secondInteger = secondInteger;
        this.result = result;
    }

    @Test
    public void testAdd() {
        assertEquals(Adder.add(firstInteger, secondInteger), result);
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
