package lecture13;

// Utility class for number operations
public class NumberUtils
{

    // Find the largest number
    public static int findMaximum(int[] array)
    {
        int maxValue = array[0];
        for (int number : array)
        {
            if (number > maxValue)
            {
                maxValue = number;
            }
        }
        return maxValue;
    }

    // Find the smallest number
    public static int findMinimum(int[] array)
    {
        int minValue = array[0];
        for (int number : array)
        {
            if (number < minValue)
            {
                minValue = number;
            }
        }
        return minValue;
    }

    // Print array using index-based loop
    public static void displayArrayUsingIndex(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Print array using enhanced-for loop
    public static void displayArrayUsingEnhancedLoop(int[] array)
    {
        for (int number : array)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Linear search to find element index
    public static int performLinearSearch(int[] array, int key)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}

