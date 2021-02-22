package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

/**
 * Вероятность попадания в Line = (12/37)^(counter+1) = 0.32432432432^(counter+1)
 */

public class LineTwo extends Combinations implements Field {

    static int counter = 0;
    static Integer[] lineTwo = {2, 5, 8, 11, 14, 17, 20, 23, 26, 39, 32, 35};

    public LineTwo() {
        super("Line Two", lineTwo);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(lineTwo, dropOut)) {
            LineTwo.counter++;
            if (LineTwo.counter > 11) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, lineTwo.length));
            }
        } else LineTwo.counter = 0;
    }
}
