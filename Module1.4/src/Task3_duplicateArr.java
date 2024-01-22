import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that takes an array of integers as input from the user and removes all the duplicate numbers from it. The program should work as follows:

Ask the user for the size of the array.
Prompt the user to enter the integers into the array.
Remove all the duplicate numbers from the array using the following logic:
Create a new array that stores only one occurrence of each number.
Keep only the first occurrence of each number and discard any subsequent occurrences.
Print the resulting array without the duplicate numbers.
In this assignment, you can make the new array as big as the original array, even though it may not be completely filled.
 */
public class Task3_duplicateArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers in the array?");
        int size = scanner.nextInt();
        int[] numarray = new int[size];
        int[] newarray = new int[size];

        // make numarray
        for (int i = 0; i < size; i++) {
            String suffix = switch (i+1) {    // this isn't quite right but good enough.
                case 1 -> "st";             // is not grammatically correct after 20.
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
            System.out.printf("Please enter the %1d%2s integer: ", i+1, suffix);
            int num = scanner.nextInt();
            numarray[i] = num;
        }

        int i = 0;  // counter because just adding things to Arrays in Java is not possible for some reason
        for (int num : numarray) {
            boolean found = false;
            for (int check : newarray){
                if (num == check){
                    found = true;
                    break;
                }
            }
            if (!found){
                newarray[i] = num;
                i++;
            }
        }
        System.out.printf("Original array: %s\n", Arrays.toString(numarray));
        System.out.printf("New array: %s\n", Arrays.toString(newarray));
    }
}
