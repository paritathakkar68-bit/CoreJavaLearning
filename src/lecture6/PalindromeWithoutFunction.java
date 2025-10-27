//Package name should always be lowercase
package lecture6;

//Class name should follow PascalCase (Each word starts with a capital letter)
public class PalindromeWithoutFunction
{

    //main method – entry point of the program
    public static void main(String[] args)
    {

        //Variable names should be descriptive and in camelCase
        int inputNumber = 121;
        int reversedNumber = 0;
        int originalNumber = inputNumber;

        //Reverse the number using a while loop
        while (inputNumber != 0)
        {
            int lastDigit = inputNumber % 10;                   // Extract last digit
            reversedNumber = reversedNumber * 10 + lastDigit;   // Build reversed number
            inputNumber /= 10;                                  // Remove last digit
        }

        //Compare reversed number with the original number
        if (originalNumber == reversedNumber)
        {
            System.out.println(originalNumber + " is a palindrome.");
        } else
        {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}


