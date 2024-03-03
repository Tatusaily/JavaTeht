package Task1;

public class Main {
    public static void main(String[] args) {
        // Create a theater with 30 seats, and five customers.
        Theater teatteri = new Theater(30);
        Customer asiakas1 = new Customer(teatteri);
        Customer asiakas2 = new Customer(teatteri);
        Customer asiakas3 = new Customer(teatteri);
        Customer asiakas4 = new Customer(teatteri);
        Customer asiakas5 = new Customer(teatteri);

        // Create wild Threads that reserve and cancel seats.
        Reserver r1 = new Reserver(30, asiakas1, asiakas2);
        Reserver r2 = new Reserver(35, asiakas3, asiakas4); // Goes over the seat count.
        Reserver r3 = new Reserver(30, asiakas5);

        // Start the threads.
        r1.start();
        r2.start();
        r3.start();

        // Wait for the threads to finish.
        try {
            r1.join();
            r2.join();
            r3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All reservations and cancellations done. \n \n");

        // Print the status of the seats.
        teatteri.printSeats();

    }
}