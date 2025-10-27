//Package names should always be in lowercase
package lecture6;

//Class names should follow PascalCase (Each word capitalized)
public class ReverseWithFunction {

    //Method to reverse a number
    //Method name should be in camelCase, and parameter should be descriptive
    static int reverseNumber(int inputNumber) {
        int reversedNumber = 0;

        //Loop to reverse the digits of the number
        while (inputNumber != 0) {
            int lastDigit = inputNumber % 10;                      // Extract last digit
            reversedNumber = reversedNumber * 10 + lastDigit;      // Append digit in reverse
            inputNumber /= 10;                                     // Remove last digit
        }

        return reversedNumber;
    }

    //main method – the starting point of the program
    public static void main(String[] args) {

        //Use meaningful variable names in camelCase
        int originalNumber = 1234;

        //Display the reversed number using the function
        System.out.println("Reversed number: " + reverseNumber(originalNumber));
    }
}