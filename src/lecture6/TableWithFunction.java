// Package name should always be lowercase
package lecture6;

// Class name should follow PascalCase (each word capitalized)
public class TableWithFunction
{

    // Method to print multiplication table
    // Method name uses camelCase; parameter name is descriptive
    static void printMultiplicationTable(int inputNumber)
    {
        // Loop from 1 to 10 to print the table
        for (int multiplier = 1; multiplier <= 10; multiplier++)
        {
            // Display one line of the multiplication table
            System.out.println(inputNumber + " x " + multiplier + " = " + (inputNumber * multiplier));
        }
    }

    // main method – the entry point of the program
    public static void main(String[] args)
    {
        // Call the method to print the table of 5
        printMultiplicationTable(5);
    }
}


