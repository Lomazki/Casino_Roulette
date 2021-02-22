package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

/**
 * Вероятность попадания в Line = (12/37)^(counter+1) = 0.32432432432^(counter+1)
 */

public class LineThree extends Combinations implements Field {

    static int counter = 0;
    static Integer[] lineThree = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};

    public LineThree() {
        super("Line Three", lineThree);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(lineThree, dropOut)) {
            LineThree.counter++;
            if (LineThree.counter > 11) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, lineThree.length));
            }
        } else LineThree.counter = 0;
    }
}
