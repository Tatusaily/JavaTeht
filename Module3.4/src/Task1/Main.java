package Task1;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        /*
        Task 1: Read a CSV file from the network location
        There is a network file (https://users.metropolia.fi/~jarkkov/temploki.csv) where we have periodical temperature measurements at 10 minutes interval.
        Create an application which reads the file, reads the 'UlkoTalo' column, and calculates the average temperature for the 1st day of January 2023.
         */
        URL myUrl;
        // Otetaan URLi valmiiksi
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }


        try{
            boolean header = true;
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            String line;
            float sum = 0;
            int n = 0;

            // Jatkuu kun lukijalla on luettavaa sivulla
            // Otetaan eka rivi, jossa on vain otsikoita, erilleen. (1. otsikko on aika, 2. on UlkoTalo.)
            // Sitten mennään rivi kerrallaan.
            while ((line = reader.readLine()) != null) {
                if (header) {
                    header = false;
                } else {
                    // tarkista pvm -> lisää lukema
                    String[] columns = line.split(";");
                    String date = columns[0].split(" ")[0];
                    if(date.equals("01.01.2023")){
                        String valueStr = columns[1].replace(",", ".");
                        float temp = Float.parseFloat(valueStr);
                        sum += temp;
                        n++;
                    }
                }
            }
            // Sivu luettu. Lasketaan keskiarvo.
            float keskiarvo = sum/n;
            System.out.printf("Lämpötilan keskiarvo Tammikuun 1. päivälle, 2023 on: %.2f °C", keskiarvo);


        } catch (IOException e) {
            System.err.println(e);
        }
    }
}