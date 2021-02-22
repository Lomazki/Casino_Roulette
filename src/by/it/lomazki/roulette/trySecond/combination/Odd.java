package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;

public class Odd extends Combinations {

    public Odd() {
        super("Odd");
        setValue(new Integer[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35});
        setLimitPoint(6);
    }
}
