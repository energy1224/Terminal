import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Bus bus1 = new Bus("Пассажирский", "Экарус", 180, 70, 190, 70, 70);
        System.out.println(bus1);
        System.out.println("Уровень топлива: " + bus1.getFuelLevel());

        bus1.fillTankFuel(bus1.getFuelCapacity(), bus1.getFuelLevel());
        System.out.println("Уровень топлива: " + bus1.getFuelLevel());

        try {
            Scanner sc = new Scanner(new File("input.txt"));
            ArrayList<Passenger> passengers = new ArrayList<>();
            int newAmmount= sc.nextInt();
            for (int i = 0; i < newAmmount; i++ ){
                passengers.add(new Passenger(sc.next(),sc.next(), sc.next() ));
            }
            System.out.println(passengers);

            for (int i = 0; i < passengers.size(); i++) {
                if (bus1 instanceof Bus)
                    bus1.getOnBoard(passengers.get(i));

            }
            System.out.println(bus1.onBoard);
            System.out.println(bus1.getVacantSeats());

           // System.out.println(onBoard);







        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }






        }





    }











