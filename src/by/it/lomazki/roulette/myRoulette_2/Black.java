package by.it.lomazki.roulette.myRoulette_2;

public class Black {
    Counter blackCounter = new Counter();
    double row = (double) 18 / 37;
    double likelihood;
    int blackOff; // - повторялось ли черное
    boolean black = false;

    public Black(int number) {
        int[] BLACK = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
        for (int i = 0; i < BLACK.length; i++) {
            if (BLACK[i] == number) {
                System.out.println("черное");
                black = true;
                blackOff = 0;
            }
        }
        if (black) {
            blackCounter.countBlack(black);
            likelihood = row;
        } else {
            int dC = blackCounter.countBlack(black); // Не сохраняет до следующего цикла. хз почему
            likelihood = 1 - Math.pow((row), dC);     // вероятность, что выпадет в следующий раз
        }
        System.out.println(likelihood);
    }

}
