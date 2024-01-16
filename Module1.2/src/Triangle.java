import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first leg of a triangle: ");
        final double SIDE1 = Math.pow(Double.parseDouble(scanner.nextLine()), 2);

        System.out.print("Enter the length of the second leg of a triangle: ");
        final double SIDE2 = Math.pow(Double.parseDouble(scanner.nextLine()), 2);

        double hypotenuse = Math.sqrt(SIDE1 + SIDE2);

        System.out.printf("The length of the hypotenuse is %3.1f", hypotenuse);

        scanner.close();
    }
}
