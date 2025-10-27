package lecture7;

/**
 * This class checks whether a given number is prime using a function.
 */
public class PrimeCheckWithFunction
{

    /**
     * Checks if the given number is a prime number.
     * @param number The number to check for primality.
     * @return true if the number is prime; false otherwise.
     */
    public static boolean isPrime(int number)
    {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1)
        {
            return false;
        }

        // Check divisibility from 2 up to half of the number
        for (int divisor = 2; divisor <= number / 2; divisor++)
        {
            if (number % divisor == 0)
            {
                return false;  // Not a prime number
            }
        }

        return true;  // Number is prime
    }

    public static void main(String[] args)
    {

        int inputNumber = 7;  // The number to be checked

        // Call the function and print result based on return value
        if (isPrime(inputNumber))
        {
            System.out.println(inputNumber + " is a Prime Number");
        } else
         {
            System.out.println(inputNumber + " is Not a Prime Number");
        }
    }
}
