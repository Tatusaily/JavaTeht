import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        final double FAHRENHEIT = Double.parseDouble(scanner.nextLine());

        final double CELSIUS = (FAHRENHEIT-32)/1.8;
        System.out.printf("%.1f degrees Fahrenheit ", FAHRENHEIT);
        System.out.printf("is %.1f degrees in Celsius", CELSIUS);

        scanner.close();
    }
}
