package lecture7;

/**
 * This class demonstrates how to print the Fibonacci series using a method.
 */
public class FibonacciWithFunction
{

    /**
     * Prints the Fibonacci series up to the given number of terms.
     * @param terms The total number of terms in the series to print.
     */
    public static void printFibonacci(int terms)
    {
        int first = 0;
        int second = 1;

        // Print the first two numbers of the series
        System.out.print(first + " " + second + " ");

        // Generate and print the remaining terms
        for (int index = 2; index < terms; index++)
        {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static void main(String[] args)
    {
        int numberOfTerms = 10;  // Define how many terms to print
        System.out.println("Fibonacci Main_changes:");
        printFibonacci(numberOfTerms);  // Call the function
    }
}
