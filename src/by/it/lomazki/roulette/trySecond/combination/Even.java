package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class Even extends Combinations implements Field {

    static int counter = 0;
    static Integer[] even = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};

    public Even() {
        super("Even", even);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(even, dropOut)) {
            Even.counter++;
            if (Even.counter > 5) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, even.length));
            }
        } else Even.counter = 0;
    }
}
