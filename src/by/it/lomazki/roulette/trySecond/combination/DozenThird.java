package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class DozenThird extends Combinations implements Field {

    static int counter = 0;
    static Integer[] dozenThird = {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

    public DozenThird() {
        super("[25-36]", dozenThird);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(dozenThird, dropOut)) {
            DozenThird.counter++;
            if (DozenThird.counter > 11) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, dozenThird.length));
            }
        } else DozenThird.counter = 0;
    }
}
