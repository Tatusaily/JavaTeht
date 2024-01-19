/*
Write a program that prompts the user to enter two positive integers, start and end (where start < end).
The program should generate and display all the prime numbers between start and end, inclusive.

A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

Your program should use control structures (such as loops and conditional statements) to implement the logic for generating and checking prime numbers.
 */
public class Task3_primenumgen {
    public static void main(String[] args) {
        // ask for two nums
        int num1 = 1;
        int num2 = 100;

        for (int i = num1; i <= num2; i++){
            //  start by assuming prime
            boolean isprime = true;

            //  find out if not prime
            if (i>1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isprime = false;
                        break;
                    }
                }
                if (isprime) {   // print if still prime
                    System.out.println(i + " is prime!");
                }
            }
        }
    }
}
