package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class Black extends Combinations implements Field {

    static int counter = 0;
    static Integer[] black = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

    public Black() {
        super("Black", black);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(black, dropOut)) {
            Black.counter++;
            if (Black.counter > 9) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, black.length));
            }
        } else Black.counter = 0;
    }
}
