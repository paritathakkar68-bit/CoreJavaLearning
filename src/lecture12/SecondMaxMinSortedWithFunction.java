//1. Using Sorting  - [With Function]

package lecture12;

import java.util.Arrays;

public class SecondMaxMinSortedWithFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 5, 40, 30};

        System.out.println("Second Minimum (Sorted): " + getSecondMin(numbers));
        System.out.println("Second Maximum (Sorted): " + getSecondMax(numbers));
    }

    // Function to get second minimum
    public static int getSecondMin(int[] arr)
    {
        Arrays.sort(arr);
        return arr[1];
    }

    // Function to get second maximum
    public static int getSecondMax(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}

