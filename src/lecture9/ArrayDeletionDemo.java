package lecture9;

public class ArrayDeletionDemo
{

    public static void main(String[] args)
    {

        int[] numbers = {10, 20, 30, 40, 50};
        int deleteIndex = 2; // Index to delete (e.g., element 30)
        int logicalSize = numbers.length;

        System.out.println("Before Deletion:");
        for (int i = 0; i < logicalSize; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        // Shift elements to the left from deleted index
        for (int i = deleteIndex; i < logicalSize - 1; i++)
        {
            numbers[i] = numbers[i + 1];
        }

        logicalSize--; // Decrease logical size

        System.out.println("\nAfter Deletion:");
        for (int i = 0; i < logicalSize; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}

