// Package name should always be in lowercase
package lecture6;

// Class name should be in PascalCase (each word capitalized)
public class ReverseWithoutFunction
{

    // main method – the entry point of the program
    public static void main(String[] args)
    {

        // Variable names should be meaningful and in camelCase
        int originalNumber = 1234;
        int reversedNumber = 0;

        // Loop to reverse the digits of the number
        while (originalNumber != 0)
        {
            int lastDigit = originalNumber % 10;                      // Extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;        // Build the reversed number
            originalNumber /= 10;                                     // Remove the last digit
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
