package by.it.lomazki.roulette.trySecond.util;

import java.util.Random;

public class Creator  {

    public static int createNumber() {
        Random random = new Random();
        return random.nextInt(37);
    }

}
