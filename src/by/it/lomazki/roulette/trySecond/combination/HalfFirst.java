package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;

public class HalfFirst extends Combinations {

    public HalfFirst() {
        super("[1-18]");
        setValue(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18});
        setLimitPoint(7);
    }
}
