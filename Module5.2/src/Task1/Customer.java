package Task1;

import java.util.ArrayList;

public class Customer{
    // Task1.Customer class has a reference to the Task1.Theater class.
    // It can reserve and cancel seats in the theater.

    Theater theater;
    ArrayList<Integer> reserved = new ArrayList<>();
    public Customer(Theater t) {
        theater = t;
    }
    public void reserveSeat(int seat) {
        Boolean bool = theater.reserveSeat(seat);
        if (bool) {
            addSeat(seat);
        }
    }
    public void cancelSeat(int seat) {
        Boolean bool = theater.cancelReservation(seat);
        if (bool) {
            removeSeat(seat);
        }
    }
    public void addSeat(int seat) {
        reserved.add(seat);
    }
    public void removeSeat(int seat) {
        reserved.remove((Integer) seat);
    }
}
