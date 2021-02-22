package by.it.lomazki.roulette.fromKostya;

import java.util.Random;

public class Creator {

    public static int createNumber() {
        Random random = new Random();
        return random.nextInt(37);
    }

}
