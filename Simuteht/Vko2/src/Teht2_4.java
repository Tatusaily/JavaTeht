
import java.util.PriorityQueue;
import java.util.Random;

public class Teht2_4 {
    static Random random = new Random();
    static Tapahtumalista taplist = new Tapahtumalista();
    public static void main(String[] args) {    // listaan 10 Tapahtumaa joilla ikä 0-100
        for (int i = 0; i < 10; i++) {
            int randint = random.nextInt(100);
            Tapahtuma uusi = new Tapahtuma(randint);
            taplist.add(uusi);
        }
        taplist.remove();
    }
}

class Tapahtumalista {
    private static PriorityQueue<Tapahtuma> lista
            = new PriorityQueue<Tapahtuma>(Tapahtuma::compareTo);

    public void add(Tapahtuma a){
        lista.add(a);
    }

    public void remove(){
        lista.remove();
    }
}

class Tapahtuma {
    private final int age;
    public Tapahtuma(int age){
        this.age = age;
    }
    public int compareTo(Tapahtuma tap){
        return age - tap.age;
    }
    public int getAge(){
        return age;
    }

}