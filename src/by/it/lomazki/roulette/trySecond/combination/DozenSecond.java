package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class DozenSecond extends Combinations implements Field {

    static int counter = 0;
    static Integer[] dozenSecond = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};

    public DozenSecond() {
        super("[13-24", dozenSecond);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(dozenSecond, dropOut)) {
            DozenSecond.counter++;
            if (DozenSecond.counter > 11) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, dozenSecond.length));
            }
        } else DozenSecond.counter = 0;
    }
}
