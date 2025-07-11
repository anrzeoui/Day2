
public class Vehicle1 {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "Swift", 2015, 15.1);
        Truck truck = new Truck("Ford", "F-150", 2016, 3.5);

        car.refuel(20);
        truck.refuel(50);  

        System.out.println("\n--- Car Details ---");
        car.displayDetails();

        System.out.println("\n--- Truck Details ---");
        truck.displayDetails();

        System.out.println("\n--- Invalid Refuel Test ---");
        car.refuel(-10);
    }
}

class Vehicle {
    private String make;
    private String model;
    private int year;
    private double fuel; 

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = 0; 
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println(amount + " liters of fuel added. Total fuel: " + fuel + " liters.");
        } else {
            System.out.println("Fuel amount must be positive.");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel + " liters");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


class Car extends Vehicle {
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be positive.");
        }
    }
}

class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }
}
