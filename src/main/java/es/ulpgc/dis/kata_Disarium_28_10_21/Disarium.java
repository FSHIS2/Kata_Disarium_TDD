package es.ulpgc.dis.kata_Disarium_28_10_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disarium {

    public boolean isDisarium(int number) {
        String stringNumber = String.valueOf(number);

        int sum = 0;
        int posInStringNumber = 0;
        while (posInStringNumber < stringNumber.length()) {
            sum += Math.pow(Integer.valueOf(stringNumber.substring(posInStringNumber, posInStringNumber + 1)), posInStringNumber + 1);
            posInStringNumber++;
        }
        return sum == number;
    }

    public List<Integer> calculateDisarium(int lowerLimit, int upperLimit) {
        List<Integer> list = new ArrayList<Integer>();
        for (int number = lowerLimit; number <= upperLimit; number++)
            if (isDisarium(number))
                list.add(number);
        return list;
    }


}
