import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        // These two next lines get the product and average and store them in variables.
        int product = first * second * third;
        int average = (first + second + third) / 3;

        System.out.println("The sum of the numbers is " + (first + second + third));
        // Print the new variables:
        System.out.println("The product is " + product + ", and the average is " + average);
    }
}
