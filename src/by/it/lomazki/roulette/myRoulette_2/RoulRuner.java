package by.it.lomazki.roulette.myRoulette_2;

import java.util.Random;

public class RoulRuner {

    public static void main(String[] args) {

        Random random = new Random();
        int number;
        for (int i = 0; i < 5; i++) {
            number = random.nextInt(36);
            System.out.println(number);
            new Black(number);

        }
    }
}
