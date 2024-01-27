import java.util.PriorityQueue;

public class Tapahtumalista {
    private static PriorityQueue<Tapahtuma> lista
            = new PriorityQueue<Tapahtuma>(Tapahtuma::compareTo);

    public void add(Tapahtuma a){
        lista.add(a);
    }

    public void remove(){
        lista.remove();
    }

    public void print() {


    }
}