package by.it.lomazki.roulette.trySecond;

import by.it.lomazki.roulette.trySecond.combination.*;
import java.util.Random;

public class Run {

    int CreateNumber() {
        Random random = new Random();
        return random.nextInt(37);
    }

    public static void main(String[] args) {

        Run run = new Run();
        LineOne lineOne = new LineOne();
        LineTwo lineTwo = new LineTwo();
        LineThree lineThree = new LineThree();
        HalfSecond halfSecond = new HalfSecond();
        HalfFirst halfFirst = new HalfFirst();
        Odd odd = new Odd();
        Even even = new Even();
        DozenThird dozenThird = new DozenThird();
        DozenSecond dozenSecond = new DozenSecond();
        DozenFirst dozenFirst = new DozenFirst();
        Red red = new Red();
        Black black = new Black();
        for (int i = 0; i < 50; i++) {
            int dropOut = run.CreateNumber();
            lineOne.MathAnalysis(dropOut);
            lineTwo.MathAnalysis(dropOut);
            lineThree.MathAnalysis(dropOut);
            halfSecond.MathAnalysis(dropOut);
            halfFirst.MathAnalysis(dropOut);
            odd.MathAnalysis(dropOut);
            even.MathAnalysis(dropOut);
            dozenThird.MathAnalysis(dropOut);
            dozenSecond.MathAnalysis(dropOut);
            dozenFirst.MathAnalysis(dropOut);
            red.MathAnalysis(dropOut);
            black.MathAnalysis(dropOut);
        }
    }
}


/**
 TODO
 1) Подумай! возможно и MathAnalysis можно сделать универсальным.
 2) Не разрешен вопрос с попаданием в число.
 */