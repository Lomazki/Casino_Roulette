package by.it.lomazki.roulette.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

// (1/37)*(18/37)^(n+1)
public class FastExample {

    public static void main(String[] args) {
        int dropOut;
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            dropOut = random.nextInt(37);
            FastExample fastExample = new FastExample();
            System.out.println(fastExample.MathExpectation(dropOut));
    }


    }
    public double MathExpectation (int counter){
        return (Math.pow(0.486486486486, counter + 1));
    }
}
/**
 DecimalFormat df = new DecimalFormat("#.0000");
 df.setRoundingMode(RoundingMode.DOWN);
 System.out.println(df.format(12.49688f));
 System.out.println(df.format(12.456));
 System.out.println(df.format(12.0));
 */