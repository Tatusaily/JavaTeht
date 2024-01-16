import java.util.Scanner;

public class Obsolete_Measurements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // grammat talteen
        System.out.print("Give weight in grams: ");
        double grams = Double.parseDouble(scanner.nextLine());
        double tempgrams = grams;

        // lasketaan grammoista muut yksiköt
        // muutetut yksiköt vähennetään aina grammoista ja jatketaan seuraavaan yksikköön
        // 13.28*32*20
        int leiviskä = (int) (grams/(13.28*32*20));
        tempgrams -= leiviskä*(13.28*32*20);
        int naula = (int) (tempgrams/(13.28*32));
        tempgrams -= naula*(13.28*32);
        double luoti = tempgrams/13.28;

        System.out.printf(grams + " grammaa on:\n");
        System.out.printf("%d leiviskää, ", leiviskä);
        System.out.printf("%d naulaa, ", naula);
        System.out.printf("%.2f luotia", luoti);

    }
}
