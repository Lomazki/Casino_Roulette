package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;
import by.it.lomazki.roulette.trySecond.Field;

public class Odd extends Combinations implements Field {

    static int counter = 0;
    static Integer[] odd = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};

    public Odd() {
        super("Odd", odd);
    }

    @Override
    public void MathAnalysis(int dropOut) {
        if (!Combinations.IsInclude(odd, dropOut)) {
            Odd.counter++;
            if (Odd.counter > 5) {
                System.out.print(getName() + " не повторялось " + counter + " раз ");
                System.out.println("MathExpectation = " + Combinations.MathExpectation(counter, odd.length));
            }
        } else Odd.counter = 0;
    }
}
