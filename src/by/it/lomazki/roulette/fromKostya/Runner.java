package by.it.lomazki.roulette.fromKostya;

public class Runner {

    public static final int COUNT_ROUND = 10000;

    public static void main(String[] args) {
        Black black = new Black();
        for (int i = 0; i < COUNT_ROUND; i++) {
            int dropOut = Creator.createNumber();
            black.mathAnalysis(dropOut);
        }

    }
}
