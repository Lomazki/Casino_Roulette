package by.it.lomazki.roulette.trySecond;

import java.util.Random;

public class Run {

    int CreateNumber() {
        Random random = new Random();
        int dropOut = random.nextInt(37);
        return dropOut;
    }

    public static void main(String[] args) {
        Run run = new Run();
        for (int i = 0; i < 50; i++) {
            int dropOut = run.CreateNumber();
            LineThree lineThree = new LineThree(dropOut);
            lineThree.MathAnalysis(dropOut);
        }
    }
}
