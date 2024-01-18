import java.util.Scanner;

/*
Write a program that prompts the user to enter a binary number (composed of 0s and 1s) and converts it to decimal.
Display the decimal equivalent on the console.
Hint: use the charAt method of the String class to retrieve the individual bits in the input string.
 */
public class Task2_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask binary
        System.out.print("Give binary: ");
        String input = scanner.nextLine();
        // Check if binary
        // Can be checked and converted in same loop.
        // Convert to decimal
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            // convert index to int
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            num = (int) Math.pow(num, i);
            sum += num;
        }
        System.out.println(sum);
        // Print decimal
        //System.out.println(decimal);
        scanner.close();
    }
}
