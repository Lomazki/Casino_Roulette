package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

/**
 * Вероятность попадания в Half = (18/37)^(counter+1) = 0.486486486486^(counter+1)
 */

public class HalfFirst extends Combinations implements Field {

    static int counter = 0;
    static Integer[] halfFirst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

    public HalfFirst() {
        super("[1-18]", halfFirst);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(halfFirst, dropOut)) {
            HalfFirst.counter++;
            if (HalfFirst.counter > 5) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, halfFirst.length));
            }
        } else HalfFirst.counter = 0;
    }
}

