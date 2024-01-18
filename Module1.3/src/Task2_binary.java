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
        // Can be checked and converted in same loop.
        // Convert to decimal
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
                // convert index to int
                // start from end and go back
                int n = input.length() - 1 - i;
                int num = Integer.parseInt(String.valueOf(input.charAt(n)));
            if (num == 1 || num == 0){
                // get value and add to sum
                num = (int) (num * Math.pow(2, i));
                sum += num;
            }else{  // value is not binary, break out of program
                    sum = -1;
                    break;
                }
        }
        if (sum != -1) {
            System.out.println("SUM IN DECIMAL = " + sum);
        } else {
            System.out.println("INPUT IS NOT A BINARY VALUE!");
        }
        scanner.close();
    }
}
