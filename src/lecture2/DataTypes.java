// Package names should be in lowercase
package lecture2;

// Class name should follow PascalCase
public class DataTypes
{

    // Main method follows camelCase
    public static void main(String[] args)
    {
        // Primitive data types - variables follow camelCase
        int totalDays = 10;
        float javaVersion = 1.8f;
        char studentGrade = 'A';
        boolean isCompleted = false;

        // Non-primitive types - variables follow camelCase
        String courseTitle = "Java Basics";
        int[] studentMarks = {50, 50};

        // Display output
        System.out.println(courseTitle + " - Version " + javaVersion);
        System.out.println("Days: " + totalDays + ", Grade: " + studentGrade);
        System.out.println("Complete: " + isCompleted);
        System.out.println("First Mark: " + studentMarks[0]);
    }
}
