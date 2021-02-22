package by.it.lomazki.roulette.trySecond;

import java.util.Arrays;

public class Combinations {

    String name;
    Integer[] value;

    public Combinations(String name, Integer[] value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public static boolean IsInclude(Integer[] combination, Integer number) {
        return (Arrays.asList(combination).contains(Integer.valueOf(number)));
    }

    public static double MathExpectation(int counter, int lengthCombination) {
        return ((1 - Math.pow((0.027027027027*lengthCombination), (counter + 1))) * 100);
    }
}

/**
 * Вероятность попадания в комбинацию = ((1/37)*lengthCombination)^(counter+1) = 0.32432432432^(counter+1)
 */
