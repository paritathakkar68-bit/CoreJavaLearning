package lecture15;

// Class Declaration
public class ConstructorExample
{

    // Instance variable
    String studentName;

    // Non-Parameterized Constructor
    ConstructorExample()
    {
        studentName = "Default Student";
        System.out.println("Non-Parameterized Constructor called.");
    }

    //  Parameterized Constructor
    ConstructorExample(String name)
    {
        studentName = name;
        System.out.println("Parameterized Constructor called.");
    }

    // Function to display student name
    void displayStudentName()
    {
        System.out.println("Student Name: " + studentName);
    }

    // Main method to run the program
    public static void main(String[] args)
    {

        // Calling Non-Parameterized Constructor
        ConstructorExample student1 = new ConstructorExample();
        student1.displayStudentName();

        System.out.println("-----------------------------");

        // Calling Parameterized Constructor
        ConstructorExample student2 = new ConstructorExample("Parita Thakkar");
        student2.displayStudentName();
    }
}

