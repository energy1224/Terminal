import java.util.ArrayList;

public class Bus extends Vehicle {

  private   int passengerСapacity;
  private   int vacantSeats;

    ArrayList<Passenger> onBoard = new ArrayList<>();






    {               // секция инициализации
        System.out.println("Автобус прибывает на станцию");

    }

    public Bus(String type, String model, double speed, double fuelLevel, int fuelCapacity, int passengerСapacity, int vacantSeats) {
        super(type, model, speed, fuelLevel, fuelCapacity);
        this.passengerСapacity = passengerСapacity;
        this.vacantSeats = vacantSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Вместимость:" + passengerСapacity + " " +
                "Свободных мест:" + vacantSeats + " "+
                "Уровень топлива:" + getFuelLevel() +
                '}';
    }

    public void getOnBoard (Passenger passenger) {
        if (passenger.getTicket().equals("оплачен")) {
            onBoard.add(passenger);
            vacantSeats--;
        }

    }

    public int getPassengerСapacity() {
        return passengerСapacity;
    }

    public void setPassengerСapacity(int passengerСapacity) {
        this.passengerСapacity = passengerСapacity;
    }

    public int getVacantSeats() {
        return vacantSeats;
    }

    public void setVacantSeats(int vacantSeats) {
        this.vacantSeats = vacantSeats;
    }




       }




