package lecture19;

// Student.java
public class Student
{

    // Static variable shared among all students
    public static int totalStudents = 0;

    private String studentName;

    // Static block - runs once when class is loaded
    static
    {
        System.out.println("Static Block: Student class loaded into memory.");
    }

    // Constructor
    public Student(String name)
    {
        this.studentName = name;
        totalStudents++;  // Increase shared counter
    }

    // Instance method
    public void showStudentInfo()
    {
        System.out.println("Student Name: " + studentName);
    }

    // Static method - utility
    public static void showTotalStudents()
    {
        System.out.println("Total Students Registered: " + totalStudents);
    }
}

