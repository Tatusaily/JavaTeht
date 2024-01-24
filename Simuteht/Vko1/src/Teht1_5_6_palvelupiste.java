import java.util.LinkedList;

public class Teht1_5_6_palvelupiste {
    public static void main(String[] args) throws InterruptedException {
        // luodaan palvelupiste ja sinne 20 asiakasta
        // Asiakasluokka lainataan edellisestä tehtävästä (1_3)
        Palvelupiste palvelupiste = new Palvelupiste();
        for (int i = 0; i < 20; i++) {
            String name = "Asiakas "+(i+1);
            Asiakas uusi = new Asiakas(name);
            palvelupiste.addToQue(uusi);
        }
        palvelupiste.palvele();
        System.out.printf("\nKeskimääräinen odotusaika = %dms\n", palvelupiste.keskiarvo);



    }
}

class Palvelupiste{ // Asiakasluokka lainataan edellisestä tehtävästä (1_3)
    LinkedList<Asiakas> queue = new LinkedList<>();
    public long keskiarvo = 0;
    public int lukum = 0;

    void addToQue(Asiakas asiakas){
        queue.addLast(asiakas);
    }
    void removeFromQue(){
        Asiakas asiakas = queue.getFirst();
        lukum++;
        keskiarvo = (keskiarvo + asiakas.time())/lukum;
        queue.removeFirst();
    }

    void palvele() throws InterruptedException {
        for (int i = 0; i < queue.size(); i++) {
            int min = 50, max = 1000;
            int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
            try {
                Thread.sleep(random_int); // 1000 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Asiakas asiakas = queue.getFirst();
            asiakas.stop();
            System.out.printf("""
                    %s Palveltu
                    Palveluaika %d - %d.
                    Kokonaisaika: %dms.
                    """,
                    asiakas.name, asiakas.aloitusaika,
                    asiakas.lopetusaika, asiakas.time());
            removeFromQue();
        }
    }
}