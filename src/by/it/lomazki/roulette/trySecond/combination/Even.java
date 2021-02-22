package by.it.lomazki.roulette.trySecond.combination;

import by.it.lomazki.roulette.trySecond.Combinations;

public class Even extends Combinations {

    public Even() {
        super("Even");
        setValue(new Integer[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36});
        setLimitPoint(6);
    }
}
