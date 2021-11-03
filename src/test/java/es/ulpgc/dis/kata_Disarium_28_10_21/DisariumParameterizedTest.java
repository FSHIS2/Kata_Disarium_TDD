package es.ulpgc.dis.kata_Disarium_28_10_21;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DisariumParameterizedTest {

    private boolean expected;
    private int number;

    @Parameterized.Parameters(name = "{index}, expected: {0}, number: {1}")
    public static Iterable data() {
        return Arrays.asList(new Object[][] {
                {true, 89}, {false, 200}, {true, 135}
        });
    }

    public DisariumParameterizedTest(boolean expected, int number) {
        this.expected = expected;
        this.number = number;
    }
    @Test
    public void test_isDisarium() {
        Disarium disarium = new Disarium();

        assertEquals(this.expected, disarium.isDisarium(this.number));
    }

}
