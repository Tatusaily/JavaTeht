import java.util.Random;
import java.util.Scanner;

/*  Task 4: Multiplication table exam
In primary school, students must memorize the multiplication tables for numbers 1 to 10.
Create a program to assist primary school students that presents the user with ten randomly generated
    multiplication problems, where the factors are integers between one and ten. After each answer,
    the program indicates whether it was correct or not.
The user receives one point for each correctly answered question.
If the user scores ten points for the entire set of problems,
the program congratulates them on mastering the multiplication tables and terminates.
Otherwise, the program starts a new set of problems.
*/
public class Task4_multtable {
    public static void main(String[] args) {
        //init
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int scoresum = 0;
        boolean win = false;
        //init

        while (!win) {
            for (int i = 0; i < 10; i++) {
                // get two random integers and present the equasion
                int randa = rand.nextInt(10) + 1; //  get two random ints
                int randb = rand.nextInt(10) + 1; //  rand 0-9 +1 -> 1-10
                System.out.print(randa + " * " + randb + " = ");
                int input = Integer.parseInt("0" + scanner.nextLine());//   0+ to avoid empty string error

                //check result and do
                if (input == (randa * randb)) {
                    scoresum++;
                    System.out.printf("CORRECT! Score: %d / 10\n", scoresum);
                } else {
                    System.out.printf("INCORRECT! Score: %d / 10\n", scoresum);
                }
            }
            if (scoresum >= 10) {
                win = true;
            } else {
                System.out.printf("You only got %d problems right. We will start again.\n", scoresum);
                scoresum = 0;
            }
        }
        System.out.println("Congratulations, you have mastered the multiplication table!");
    }
}
