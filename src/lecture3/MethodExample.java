// Package name should be in lowercase
package lecture3;

// Class name should follow PascalCase
public class MethodExample
{

    // Static method (no object needed) - method name in camelCase, descriptive
    static void printStaticGreeting()
    {
        System.out.println("Hello from static method!");
    }

    // Static method with parameters - camelCase
    static void printStaticSum(int firstNumber, int secondNumber)
    {
        System.out.println("Static Sum: " + (firstNumber + secondNumber));
    }

    // Non-static method (requires object) - camelCase
    void printNonStaticGreeting()
    {
        System.out.println("Hello from non-static method!");
    }

    // Non-static method with parameters - camelCase
    void printNonStaticDifference(int firstNumber, int secondNumber)
    {
        System.out.println("Non-static Difference: " + (firstNumber - secondNumber));
    }

    // Main method
    public static void main(String[] args)
    {
        // Call static methods using class name
        MethodExample.printStaticGreeting();
        MethodExample.printStaticSum(10, 6);

        // Create object to call non-static methods
        MethodExample methodExampleInstance = new MethodExample();
        methodExampleInstance.printNonStaticGreeting();
        methodExampleInstance.printNonStaticDifference(10, 6);
    }
}
