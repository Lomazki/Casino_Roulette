package by.it.lomazki.roulette.trySecond;

import java.util.Arrays;
/**
 * Вероятность попадания в LineThree = (18/37)^(counter+1)
 * = 0.486486486486^(counter+1)
 */

public class LineThree extends Combinations implements Field {
    static int counter = 0;
    static Integer[] lineThree = new Integer[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};

    public LineThree() {
        super("Line Three", lineThree);
    }

    void MathAnalysis(int dropOut) {
        if (!IsInclude(lineThree, dropOut)) {
            LineThree.counter++;
            MathExpectation(counter);
            if (LineThree.counter > 9) {
                System.out.print(getName() + " не повторялось " + counter + " раз " + "! recommend! ");
                System.out.println("MathExpectation = " + MathExpectation(counter));
            }
        } else LineThree.counter = 0;
    }

    @Override
    public boolean IsInclude(Integer[] combination, Integer number) {
        return (Arrays.asList(combination).contains(Integer.valueOf(number)));
    }

    @Override
    public double MathExpectation(int counter) {
        return ((1 - Math.pow(0.486486486486, (counter + 1)) * 100));
    }
}
