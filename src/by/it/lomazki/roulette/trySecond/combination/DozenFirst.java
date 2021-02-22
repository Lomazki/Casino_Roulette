package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class DozenFirst extends Combinations implements Field {

    static int counter = 0;
    static Integer[] dozenFirst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public DozenFirst() {
        super("[1-12]", dozenFirst);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(dozenFirst, dropOut)) {
            DozenFirst.counter++;
            if (DozenFirst.counter > 11) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, dozenFirst.length));
            }
        } else DozenFirst.counter = 0;
    }
}
