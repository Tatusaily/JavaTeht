import java.util.Random;
import java.util.Scanner;

public class Task1_Namegen {
    public static void main(String[] args) {
        // Boiler
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // Lists of names
        String[] firstNames = {"James", "Mary", "Robert", "Patricia", "John",
                "Jennifer", "Michael", "Linda", "Donald", "George",
                "Jeffrey", "Jeff", "Joseph", "Helen", "Maria"};
        String[] lastNames = {"Smith", "Martin", "Williams", "Davis", "Brown",
                "Wilson", "Lee", "Jackson", "Bezos", "Jenkins"};

        System.out.print("How many names would you like to generate? ");
        int namenum = Integer.parseInt("0" + scanner.nextLine());//   0+ to avoid empty string error

        // Loop to get names
        for (int i = 0; i < namenum; i++) {
            int firstrand = rand.nextInt(firstNames.length);
            int secondrand = rand.nextInt(lastNames.length);
            String fullname = firstNames[firstrand] + " " + lastNames[secondrand];
            System.out.println(fullname);
        }
    }
}
