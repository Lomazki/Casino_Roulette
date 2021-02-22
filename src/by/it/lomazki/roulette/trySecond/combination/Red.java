package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class Red extends Combinations implements Field {

    static int counter = 0;
    static Integer[] red = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

    public Red() {
        super("Red", red);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(red, dropOut)) {
            Red.counter++;
            if (Red.counter > 9) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, red.length));
            }
        } else Red.counter = 0;
    }
}
