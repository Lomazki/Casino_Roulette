package by.it.lomazki.roulette.fromKostya;

import java.util.Arrays;

public class Combination {

    public static final int ATTEMPT_COUNT = 9;

    private String name;
    private int counter;
    private Integer[] value;

    public Combination(String name) {
        this.name = name;
        this.counter = 0;
    }

    public String getName() {
        return name;
    }

    public void setValue(Integer[] value) {
        this.value = value;
    }

    public boolean isInclude(Integer number) {
        return Arrays.asList(this.value).contains(number);
    }

    public double mathExpectation() {
        return ((1 - Math.pow((0.027027027027 * value.length), (this.counter + 1))) * 100);
    }

    public void mathAnalysis(int dropOut) {
        if (!isInclude(dropOut)) {
            this.counter++;

            if (this.counter > ATTEMPT_COUNT) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + mathExpectation());
            }
        } else {
            this.counter = 0;
        }
    }
}

/**
 * Вероятность попадания в комбинацию = ((1/37)*lengthCombination)^(counter+1) =
 * 0.32432432432^(counter+1)
 */
