package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

/**
 * Вероятность попадания в Line = (12/37)^(counter+1) = 0.32432432432^(counter+1)
 */

public class LineOne extends Combinations implements Field {

    static int counter = 0;
    static Integer[] lineOne = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};

    public LineOne() {
        super("Line One", lineOne);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(lineOne, dropOut)) {
            LineOne.counter++;
            if (LineOne.counter > 11) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, lineOne.length));
            }
        } else LineOne.counter = 0;
    }
}
