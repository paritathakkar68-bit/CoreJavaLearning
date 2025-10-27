//Package name should always be in lowercase
package lecture6;

//Class name should follow PascalCase (each word capitalized)
public class PalindromeWithFunction
{

    //Method to check if a number is a palindrome
    //Method name in camelCase; parameter name is descriptive
    static boolean isPalindrome(int inputNumber)
    {

        int reversedNumber = 0;
        int originalNumber = inputNumber;

        //Reverse the number using a while loop
        while (inputNumber != 0)
        {
            int lastDigit = inputNumber % 10;                 // Extract last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Build reversed number
            inputNumber /= 10;                                // Remove last digit
        }

        //Return true if original and reversed numbers match
        return originalNumber == reversedNumber;
    }

    //main method – entry point of the program
    public static void main(String[] args)
    {

        //Variable name should be meaningful and follow camelCase
        int testNumber = 121;

        //Check if number is a palindrome using the method
        if (isPalindrome(testNumber))
        {
            System.out.println(testNumber + " is a palindrome.");
        } else
        {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
}
