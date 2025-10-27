package lecture19;

// FinalAndStaticDemo.java

// FINAL CLASS - can't be inherited
final class FinalClassExample
{
    public void displayMessage()
    {
        System.out.println("Inside final class: FinalClassExample");
    }
}

// Main demo class
public class FinalAndStaticDemo
{

    // FINAL VARIABLE - value can't be changed
    final int MAX_USERS = 200;

    // STATIC VARIABLE - shared by all instances
    static int totalInstances = 0;

    // Instance variable
    String objectName;

    // Constructor
    public FinalAndStaticDemo(String name)
    {
        objectName = name;
        totalInstances++; // shared count
    }

    // FINAL METHOD - can't be overridden
    public final void showFinalMethod()
    {
        System.out.println("This is a final method. Cannot be overridden.");
    }

    // STATIC METHOD - can be called without object
    public static void showStaticInfo()
    {
        System.out.println("Static Method Called - Total Instances Created: " + totalInstances);
    }

    // STATIC BLOCK - runs once when class loads
    static
    {
        System.out.println("Static Block Executed - Class Loaded");
    }

    // Instance Method
    public void showDetails()
    {
        System.out.println("Object Name: " + objectName);
        System.out.println("Max Users (final variable): " + MAX_USERS);
    }

    // Main Method
    public static void main(String[] args)
    {
        // Creating objects
        FinalAndStaticDemo obj1 = new FinalAndStaticDemo("FirstObject");
        FinalAndStaticDemo obj2 = new FinalAndStaticDemo("SecondObject");

        // Displaying object details
        obj1.showDetails();
        obj2.showDetails();

        // Calling final method
        obj1.showFinalMethod();

        // Calling static method
        FinalAndStaticDemo.showStaticInfo();

        // Using final class
        FinalClassExample finalObj = new FinalClassExample();
        finalObj.displayMessage();
    }
}

