package lecture2;

//creation of class and object

// Class to represent a Student
public class Student {

    // Attributes (fields)
    String name;
    int age;

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Creating an object of Student class
        Student studentOne = new Student();

        // Assigning values to the object
        studentOne.name = "Parita";
        studentOne.age = 24;

        // Calling the method using the object
        studentOne.displayInfo();
    }
}

