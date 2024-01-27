import Distributions.Binomial;

public class Saapumisprosessi{  // Task4
    private final Tapahtumalista taplist;
    private final Binomial generator;
    public Saapumisprosessi(Tapahtumalista lista, Binomial generator){ // constructor
        this.taplist = lista;
        this.generator = generator;
    }
    private int getRandom(){
        return (int) generator.sample();
    }
    public void addTapahtuma(){
        Tapahtuma a = new Tapahtuma(getRandom());
        taplist.add(a);
    }


    public static void main(String[] args) {
        // TODO Tähän tarvitaan vielä Kello, johon kaikki verrataan.
        Binomial generator = new Binomial(0.5, 10);
        Tapahtumalista taplist = new Tapahtumalista();
        Saapumisprosessi prosessi = new Saapumisprosessi(taplist, generator);
    }
}
