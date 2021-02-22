package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;

public class DozenFirst extends Combinations {

    public DozenFirst() {
        super("[1-12]");
        setValue(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        setLimitPoint(11);
    }
}
