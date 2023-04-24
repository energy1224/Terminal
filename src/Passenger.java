import java.util.ArrayList;

public class Passenger {

    String ticketPaid;




    public Passenger(String ticketPaid) {
        this.ticketPaid = ticketPaid;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Наличие билета: " + ticketPaid +
                '}';
    }



}
