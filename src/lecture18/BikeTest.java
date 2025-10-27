package lecture18;

// Interface declaring bike operations
interface BikeOperations {
    void startBike();
    void stopBike();
}

// Abstract class with common bike features
abstract class AbstractBike implements BikeOperations {
    String bikeBrand;

    // Constructor using 'this' keyword
    AbstractBike(String brand) {
        this.bikeBrand = brand;
        System.out.println("AbstractBike constructor called for brand: " + this.bikeBrand);
    }

    // Concrete method
    public void showBrand() {
        System.out.println("Bike Brand: " + this.bikeBrand);
    }

    // Abstract method to be implemented by child class
    public abstract void displayEngineType();

    // Method with some logic
    public void regularService() {
        System.out.println("Service every 3000 km is recommended.");
    }
}

// Concrete class extending abstract class and implementing interface
class SportsBike extends AbstractBike {
    String bikeModel;

    // Constructor using 'super' and 'this'
    SportsBike(String brand, String model) {
        super(brand); // Call to parent constructor
        this.bikeModel = model; // Refers to current object's model
        System.out.println("SportsBike constructor called for model: " + this.bikeModel);
    }

    // Implementing abstract method
    public void displayEngineType() {
        System.out.println("Engine Type: 600cc DOHC");
    }

    // Implementing interface methods
    public void startBike() {
        System.out.println("Sports bike started with button ignition.");
    }

    public void stopBike() {
        System.out.println("Sports bike stopped using disc brakes.");
    }

    // Method to show full details using super and this
    public void showBikeDetails() {
        super.showBrand(); // Calling parent method
        System.out.println("Bike Model: " + this.bikeModel);
    }
}

// Main class to execute the program
public class BikeTest {
    public static void main(String[] args) {
        // Create object of SportsBike
        SportsBike myBike = new SportsBike("Yamaha", "R15");

        // Call various methods
        myBike.startBike();
        myBike.displayEngineType();
        myBike.regularService();
        myBike.showBikeDetails();
        myBike.stopBike();
    }
}

