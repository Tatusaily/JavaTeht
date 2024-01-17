import javax.swing.plaf.basic.BasicBorders;
import java.util.Scanner;

public class Task1_equation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give coefficients for formula ax^2 + bx + c");
        System.out.print("Give value for a: ");
        final double A_COFF = Double.parseDouble(scanner.nextLine());
        System.out.print("Give value for b: ");
        final double B_COFF = Double.parseDouble(scanner.nextLine());
        System.out.print("Give value for c: ");
        final double C_COFF = Double.parseDouble(scanner.nextLine());
        // Formula: (-b +- √b^2-4ac) / 2a
        final double DET = Math.pow(B_COFF, 2)-4*A_COFF*C_COFF;
        if (DET < 0){
            System.out.println("No real roots!");
        }else{
            final double ROOT1 = -B_COFF + Math.sqrt(DET)/(2*A_COFF);
            final double ROOT2 = -B_COFF - Math.sqrt(DET)/(2*A_COFF);
            if (ROOT1  != ROOT2) {
                System.out.println("Roots are " + ROOT1 + " and " + ROOT2);
            }else{
                System.out.println("Root is " + ROOT1);
            }
        }
    }
}
