public abstract class Vehicle {

    private String type;
    private String model;
    private double speed;
    private double fuelLevel;

    private int fuelCapacity;

    public Vehicle(String type, String model, double speed, double fuelLevel, int fuelCapacity) {
        this.type = type;
        this.model = model;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getSpeed() {

        return speed;
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed > speed) {
            while (newSpeed < speed) {
                speed++;
                System.out.println("ррррр");
            }
        } else {
            while (speed > newSpeed) {
                speed--;
                System.out.println("шшшшшшш");
            }
        }

    }

    public void setSpeedLower(int tormoz) {
        if (tormoz == 1) {
            while (speed > 0) {
                speed -= 2;
                System.out.println("и-и-и-и");
            }
        }
    }

    public Double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void fillTankFuel(int fuelCapacity, double fuelLevel){
        if (fuelLevel<fuelCapacity){
            System.out.println("Уровень топлива низкий. Нужна дозаправка");
            System.out.println("Заправка");
            while( fuelLevel<fuelCapacity)
                fuelLevel++;
        }

        setFuelLevel(fuelLevel);
        System.out.println("Теперь полный бак");


    }

}



