package by.it.lomazki.roulette.trySecond;

import java.util.Arrays;

public class Combinations {

    static double ONE_37 = 0.027027027027;

    private String name;
    private Integer[] value;
    private int counter;
    private int limitPoint;

    public static boolean isInclude(Integer[] combination, Integer number) {
        return Arrays.asList(combination).contains(number);
    }

    public static double mathExpectation(int counter, Integer[] value) {
        return ((1 - Math.pow((ONE_37 * value.length), (counter + 1))) * 100);
    }

    public void MathAnalysis(int dropOut) {
        if (!isInclude(this.value, dropOut)) {
            this.counter++;

            if (this.counter > limitPoint) {
                System.out.print(getName() + " не повторялось " + this.counter + " раз ");
                System.out.println("MathExpectation = " + mathExpectation(this.counter, this.value));
            }
        } else this.counter = 0;
    }

    public void setLimitPoint(int limitPoint) {
        this.limitPoint = limitPoint;
    }

    public void setValue(Integer[] value) {
        this.value = value;
    }

    public Combinations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/**
 * Вероятность попадания в комбинацию = ((1/37)*lengthCombination)^(counter+1) = 0.32432432432^(counter+1)
 */
