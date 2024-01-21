public class Teht1_3 {
    // pieni funktio odottelua varten
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Asiakas asse = new Asiakas("Asse");
        Asiakas pesse = new Asiakas("Pesse");
        wait(100);

        asse.stop();
        wait(100);
        pesse.stop();

        asse.printData();
        pesse.printData();
    }
}

class Asiakas {
    private static int idcount = 0;
    private final int ID;
    private final String name;
    private final long aloitusaika;
    private long lopetusaika;

    public Asiakas(String name){   //constructor
        this.ID = ++idcount;
        this.name = name;
        this.aloitusaika = System.currentTimeMillis();
    }

    public int getId() {
        return this.ID;
    }

    public void stop(){ //timestop
        this.lopetusaika = System.currentTimeMillis();
    }
    public long time(){ // return total time
        return (this.lopetusaika - this.aloitusaika);
    }

    public void printData(){
        System.out.printf("""
                Name: %s
                ID: %d
                Total time: %d

                """, this.name, this.getId(), this.time());
    }
}


