package Task1;

public class Main {
    /*  Task 1: Multi-threaded Number Printing
        Write a Java program that uses two threads to print numbers alternately.
        One thread should print odd numbers, and the other thread should print even numbers.
        The program should allow specifying a range of numbers to be printed.
     */
    public static void main(String[] args) {

        // Limits
        int min = 0;
        int max = 10;

        // Make Threads and run
        Thread evenT = new Thread(new Counter(min, max, true));
        Thread oddT = new Thread(new Counter(min, max, false));
        evenT.start(); oddT.start();
    }
}
