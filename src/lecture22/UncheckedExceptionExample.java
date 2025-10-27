package lecture22;

public class UncheckedExceptionExample
{

    public static void main(String[] args)
    {
        // Declare and initialize an integer array with 3 elements
        int[] numbers = {1, 2, 3};

        // Try to access an index that does not exist (index 5)
        // This will throw an ArrayIndexOutOfBoundsException
        System.out.println("Value at index 5 is: " + numbers[5]);
    }
}

