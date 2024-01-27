import Distributions.Binomial;

import java.util.PriorityQueue;

public class Saapumisprosessi{  // Task4&5
    private final Tapahtumalista taplist;
    private final Binomial generator;
    private final Kello kello;
    public Saapumisprosessi(Tapahtumalista lista, Binomial generator, Kello kello){ // constructor
        this.taplist = lista;
        this.generator = generator;
        this.kello = kello;
    }
    private int getRandom(){
        return (int) generator.sample();
    }
    public void addTapahtuma(){ // Kelloa edistetään satunnaisella ajalla. Asiakas luodaan ja sille annetaan kellonaika.
        int time = getRandom();
        time += this.kello.getTime();
        this.kello.setTime(time);
        Tapahtuma a = new Tapahtuma(time);
        taplist.add(a);
    }
    public PriorityQueue<Tapahtuma> getList(){
        return this.taplist.getList();
    }
    public void palvelekaikki(){
        int size = taplist.getList().size();
        for (int i = 0; i < size; i++) {
            Tapahtuma a = taplist.getList().peek();
            System.out.printf("Asiakkaan kulutettu aika: %d\n", a.getTime(kello.getTime()));     //IDEA sanoo et voi tulla NULL, mut se valehtelee.
            taplist.remove();
        }
    }




    public static void main(String[] args) {
        Binomial generator = new Binomial(0.5, 100);    // 0-100, keskiarvo noin 50.
        Tapahtumalista taplist = new Tapahtumalista();
        Kello kello = Kello.getInstance();
        kello.setTime(0);
        Saapumisprosessi prosessi = new Saapumisprosessi(taplist, generator, kello);


        for (int i = 0; i < 10; i++) {  // 10 tapahtumaa
            prosessi.addTapahtuma();
        }
        // Tapahtumat luotu ja listassa. Kello on viimeisen asiakkaan saapumisaika + 10
        System.out.printf("Lista: %s \n", prosessi.getList());
        System.out.printf("Kello on: %d\n", kello.getTime());
        System.out.println("TAPAHTUMAT LUOTU JA LISTASSA, TEHT 4 VALMIS.");

        kello.setTime(kello.getTime()+10);
        prosessi.palvelekaikki();
        // Asiakkaat(tapahtumat) on palveltu ja jono on tyhjä.
        System.out.println("ASIAKKAAT PALVELTU JA LISTA TYHJÄ. TEHT 5 VALMIS.");

    }
}
