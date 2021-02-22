package by.it.lomazki.roulette.trySecond;

import by.it.lomazki.roulette.trySecond.combination.*;
import by.it.lomazki.roulette.trySecond.util.Creator;

import java.util.ArrayList;

public class Runner {

    public static final int COUNT_ROUND = 50;

    public static void main(String[] args) {

        ArrayList<Combinations> objects = new ArrayList<>();

        objects.add(new LineOne());
        objects.add(new DozenFirst());
        objects.add(new DozenSecond());
        objects.add(new LineTwo());
        objects.add(new LineThree());
        objects.add(new HalfSecond());
        objects.add(new HalfFirst());
        objects.add(new Odd());
        objects.add(new Even());
        objects.add(new DozenThird());
        objects.add(new Red());
        objects.add(new Black());

        for (int i = 0; i < COUNT_ROUND; i++) {
            for (Combinations combination : objects) {
                combination.MathAnalysis(Creator.createNumber());
            }
        }
    }
}

/**
 * TODO
 * Не разрешен вопрос с попаданием в число.
 */