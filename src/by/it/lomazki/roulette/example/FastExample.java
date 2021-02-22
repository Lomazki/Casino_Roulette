package by.it.lomazki.roulette.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

// (1/37)*(18/37)^(n+1)
public class FastExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Math.pow(0.486486486486, (number)));
        System.out.println(((1 - Math.pow(0.486486486486, (number))) * 100));
    }
}