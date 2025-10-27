package lecture7;

/**
 * This class checks whether a given number is prime without using a method.
 */
public class PrimeCheckWithoutFunction
{

    public static void main(String[] args)
    {

        int inputNumber = 10;  // Number to be checked for primality
        boolean isPrime = true;  // Flag to track if the number is prime

        // Check if number is less than or equal to 1 (not prime)
        if (inputNumber <= 1)
        {
            isPrime = false;
        } else
        {
            // Loop from 2 to half of the inputNumber
            for (int divisor = 2; divisor <= inputNumber / 2; divisor++) {
                if (inputNumber % divisor == 0) {
                    isPrime = false;  // Found a factor, not prime
                    break;  // No need to check further
                }
            }
        }

        // Print the result based on isPrime flag
        if (isPrime)
        {
            System.out.println(inputNumber + " is a Prime Number");
        } else
        {
            System.out.println(inputNumber + " is Not a Prime Number");
        }
    }
}
