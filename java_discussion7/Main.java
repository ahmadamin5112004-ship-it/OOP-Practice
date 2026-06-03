package java_discussion7;

class Car {
 
    private String owner;
    private String brandName;
    private String serialNumber;
    private double fuelLevel;   // in liters
    private boolean isRunning;


    public Car(String owner, String brandName, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false; // car is off initially
    }


    public void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started successfully.");
        } else {
            System.out.println("Cannot start car. No fuel!");
        }
    }


    public void stopCar() {
        isRunning = false;
        System.out.println("Car stopped.");
    }


    public void checkFuel() {
        System.out.println("Current fuel level: " + fuelLevel + " liters");
    }


    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println(amount + " liters added. New fuel level: " + fuelLevel);
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

   
    public String getOwner() {
        return owner;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Rahim", "Toyota", "SN12345", 10.5);

        car.checkFuel();
        car.startCar();
        car.refuel(5);
        car.stopCar();
    }
}
