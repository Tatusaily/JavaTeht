import java.util.Arrays;
import java.util.Random;

public class Teht2_3 {  // Annetaan ikäjoukko ja luodaan satunnaisesti samaa jakaumaa noudattava joukko.
    static Random rand = new Random();
    public static void main(String[] args) {

        // Lista teennäisistä ikälukemista
        int[] agelist = {18, 18, 19, 19, 20, 21, 21, 22, 22, 22, 23, 24, 25, 26, 26, 26, 30, 35, 42};

        // luodaan uusi lista ja generoidaan satunnaisia ikiä
        int[] newlist = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int rand_i = rand.nextInt(agelist.length);
            int randage = agelist[rand_i];
            newlist[i] = randage;
        }

        System.out.println(Arrays.toString(newlist));
    }
}
