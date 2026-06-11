class Vehicle {
    void start() { // Parent method
        System.out.println("Vehicle is starting");
    }

    final void fuelType() { // Final method
        System.out.println("Most vehicles use petrol or diesel");
    }
}

class ElectricCar extends Vehicle {
    // Overriding parent method
    void start() {
        System.out.println("ElectricCar is starting silently");
    }

    // Overloading start method
    void start(String mode) {
        System.out.println("ElectricCar is starting in " + mode + " mode");
    }
}

class Garage {
    static int totalVehicles = 0; // Static variable

    Garage() { // Constructor
        totalVehicles++;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();

        // Overriding
        ec.start();                

        // Overloading
        ec.start("eco");           

        // Final method cannot be overridden
        ec.fuelType();             

        // Static variable demonstration
        Garage g1 = new Garage();
        Garage g2 = new Garage();
        Garage g3 = new Garage();
        System.out.println("Total vehicles in garage: " + Garage.totalVehicles);
    }
}