import java.util.LinkedList;
import java.util.Scanner;

/*
(O) Kirjoita ohjelma, jossa luot edellisessä tehtävässä koodattuja asiakkaita sekä viet niitä
jonoon ja poistat niitä siitä ohjelman käyttäjän toimesta (tee yksinkertainen tekstipohjainen
käyttöliittymä, jossa käyttäjältä pyydetään toimenpiteitä: lisää, poista). Käytä jonona
LinkedList-luokkaa FIFO-periaatteella (first in first out, kauimmin listassa ollut pääsee
ensimmäisenä ulos: LinkedList-luokan add- ja remove-metodit). Kirjoita testiohjelma ja tulosta
kunkin poistetun asiakkaan jonossa kuluttama aika. Ajan mittaamiseen voit käyttää
System.nanotime()-metodia.
 */
public class Teht1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asiakasluokka lainataan edellisestä tehtävästä (1_3)
        LinkedList<Asiakas> asiakaslist = new LinkedList<>();
        String state = "";
        System.out.println("Tervetuloa!");
        while (!state.equals("3")) {
            System.out.println("""
                    1) Lisää uusi asiakas.
                    2) Poista asiakas.
                    3) Poistu ohjelmasta.
                    """);
            state = scanner.nextLine();
            if (state.equals("1")){
                System.out.println("Anna nimi: ");
                String name = scanner.nextLine();
                Asiakas uusi = new Asiakas(name);
                asiakaslist.addLast(uusi);
            } else if (state.equals("2")) {
                if (asiakaslist.isEmpty()){
                    System.out.println("Ei ole asiakkaita :(");
                }else {
                    System.out.println("Poistit asiakkaan.");
                    asiakaslist.getFirst().printData();
                    asiakaslist.removeFirst();
                }
            }
        }
        System.out.println("Poistutaan ohjelmasta.");
    }
}
