package by.it.lomazki.roulette.example;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Integer[] lineThree = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
        Scanner scanner = new Scanner(System.in);
        Integer dropOut = scanner.nextInt();
        System.out.println(IsInclude(lineThree, dropOut));
    }

    private static boolean IsInclude(Integer[] array, Integer dropOut) {
        return (Arrays.asList(array).contains(Integer.valueOf(dropOut)));
    }
}
