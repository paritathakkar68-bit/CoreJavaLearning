package lecture18;

// Parent class: Person
class Person {
    String name = "Parita";

    // Parent class constructor
    Person() {
        System.out.println("Person constructor called");
    }

    // Parent class method
    void showRole() {
        System.out.println("Role: Person");
    }
}

// Child class: Student
class Student extends Person {
    String name = "Student Name";

    // Constructor using super() and this.method()
    Student() {
        // Call parent constructor
        super();

        // Call current class method
        this.printDetails();
    }

    // Method showing use of this.variable and super.variable
    void printDetails() {
        System.out.println("Parent name: " + super.name);   // Access parent variable
        System.out.println("Child name: " + this.name);     // Access current class variable

        super.showRole(); // Call parent method
        this.showRole();  // Call current class method
    }

    // Method overriding
    void showRole() {
        System.out.println("Role: Student");
    }
}

// Main class to run the example
public class ThisSuperDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
    }
}

