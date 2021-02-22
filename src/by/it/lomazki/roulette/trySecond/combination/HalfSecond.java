package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

/**
 * Вероятность попадания в Half = (18/37)^(counter+1) = 0.486486486486^(counter+1)
 */

public class HalfSecond extends Combinations implements Field {

    static int counter = 0;
    static Integer [] halfSecond = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

    public HalfSecond() {
        super("[19-36]", halfSecond);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(halfSecond, dropOut)) {
            HalfSecond.counter++;
            if (HalfSecond.counter > 5) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, halfSecond.length));
            }
        } else HalfSecond.counter = 0;
    }
}
