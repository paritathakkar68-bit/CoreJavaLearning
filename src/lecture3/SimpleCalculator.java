// Package names should be lowercase
package lecture3;

// Class names should follow PascalCase
public class SimpleCalculator
{

    // Method to calculate sum using parameters (camelCase)
    void calculateSumWithParams(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        System.out.println("Sum (with params): " + sum);
    }

    // Method to calculate sum without parameters
    void calculateSumWithoutParams()
    {
        int firstNumber = 5;
        int secondNumber = 3;
        int sum = firstNumber + secondNumber;
        System.out.println("Sum (no params): " + sum);
    }

    // Method to calculate difference using parameters
    void calculateDifferenceWithParams(int firstNumber, int secondNumber)
    {
        int difference = firstNumber - secondNumber;
        System.out.println("Difference (with params): " + difference);
    }

    // Method to calculate difference without parameters
    void calculateDifferenceWithoutParams()
    {
        int firstNumber = 10;
        int secondNumber = 4;
        int difference = firstNumber - secondNumber;
        System.out.println("Difference (no params): " + difference);
    }

    // Main method
    public static void main(String[] args)
    {
        // Create object to call methods
        SimpleCalculator calculator = new SimpleCalculator();

        // Call all methods
        calculator.calculateSumWithParams(8, 2);
        calculator.calculateSumWithoutParams();
        calculator.calculateDifferenceWithParams(15, 5);
        calculator.calculateDifferenceWithoutParams();
    }
}
