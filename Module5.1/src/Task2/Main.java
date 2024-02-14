package Task2;

import java.util.Random;

public class Main {
    /*  Create a Java program that calculates the sum of numbers in parallel using multiple threads.
        In this exercise, each thread calculates the sum of a portion of the numbers.

        Luo lukujono
        Säikeet laskee omat osansa
        Säikeiden summat summataan lopussa ja saadaan lopullinen summa.
     */

    public static void main(String[] args) {

        // Luodaan lista 100 miljoonasta satunnaisluvusta väliltä 1 - 100 (inc)
        Random rand = new Random();
        int[] arr = new int[100000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) + 1;
        }


    }
}
