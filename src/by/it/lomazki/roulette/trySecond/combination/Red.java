package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;

public class Red extends Combinations {

    public Red() {
        super("Red");
        setValue(new Integer[]{1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36});
        setLimitPoint(6);
    }
}
