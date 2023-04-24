import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Пассажирский", "Экарус", 180, 70, 190, 70, 37);
        System.out.println(bus1);
        System.out.println("Уровень топлива: " + bus1.getFuelLevel());


        bus1.fillTankFuel(bus1.getFuelCapacity(), bus1.getFuelLevel());
        System.out.println("Уровень топлива: " + bus1.getFuelLevel());

        ArrayList<Passenger> passengerList = new ArrayList<>();
        Passenger newPassenger = new Passenger("yes");
        passengerList.add(newPassenger);
        Passenger newPassenger1 = new Passenger("no");
        passengerList.add(newPassenger1);
        Passenger newPassenger2 = new Passenger("yes");
        passengerList.add(newPassenger2);
        System.out.println(passengerList);
        System.out.println(passengerList.get(0));

        for (int i= 0; i< passengerList.size(); i++){

        }





    }
}










