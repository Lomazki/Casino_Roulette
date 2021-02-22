package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;

public class Black extends Combinations {

    public Black() {
        super("Black");
        setValue(new Integer[]{2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35});
        setLimitPoint(6);
    }
}
