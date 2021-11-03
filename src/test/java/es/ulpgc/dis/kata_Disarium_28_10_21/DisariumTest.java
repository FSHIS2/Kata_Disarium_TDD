package es.ulpgc.dis.kata_Disarium_28_10_21;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DisariumTest {

    @Test
    public void return_true_false_with_numbers_89_200() {
        Disarium disarium = new Disarium();

        assertEquals(true, disarium.isDisarium(89));
        assertEquals(false, disarium.isDisarium(200));
    }

    @Test
    public void test_Disarium_between_0_150() {
        Integer [] disariumBetween0and150 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 135};
        List<Integer> list = Arrays.asList(disariumBetween0and150);

        Disarium disarium = new Disarium();
        List<Integer> listCalculated = disarium.calculateDisarium(0, 150);

        assertEquals(true, listCalculated.equals(list));
    }

    @Test
    public void test_Disarium_between_151_550() {
        Integer [] disariumBetween151and550 = {175, 518};
        List<Integer> list = Arrays.asList(disariumBetween151and550);

        Disarium disarium = new Disarium();
        List<Integer> listCalculated = disarium.calculateDisarium(151, 550);

        assertEquals(true, listCalculated.equals(list));
    }

    @Test
    public void test_Disarium_between_551_5000() {
        Integer [] disariumBetween151and550 = {598, 1306, 1676, 2427};
        List<Integer> list = Arrays.asList(disariumBetween151and550);

        Disarium disarium = new Disarium();
        List<Integer> listCalculated = disarium.calculateDisarium(551, 5000);

        assertEquals(true, listCalculated.equals(list));
    }
}
