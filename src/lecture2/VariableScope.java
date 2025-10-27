public class VariableScope
{

    // Global variable (declared inside class, outside method)
    int studentId = 101;

    // Method with local variable
    void showStudentDetails()
    {
        // Local variable (only accessible in this method)
        String studentName = "Aman";

        System.out.println("Student ID: " + studentId);         // Global variable
        System.out.println("Student Name: " + studentName);     // Local variable
    }

    public static void main(String[] args)
    {
        // Create object of class
        VariableScope student = new VariableScope();

        // Call method using object
        student.showStudentDetails();
    }
}
