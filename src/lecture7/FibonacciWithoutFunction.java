package lecture7;

/**
 * This class prints the Fibonacci series without using a separate method.
 */
public class FibonacciWithoutFunction
{

    public static void main(String[] args)
    {

        int numberOfTerms = 10;  // Total number of terms to print

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");
        System.out.print(first + " " + second + " ");

        // Loop to generate and print the remaining terms of the Fibonacci series
        for (int index = 2; index < numberOfTerms; index++)
        {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
