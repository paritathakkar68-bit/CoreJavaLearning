//1. Using Sorting  - [Without Function]

package lecture12;

import java.util.Arrays;

public class SecondMaxMinSortedWithoutFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 5, 40, 30};

        // Sort the array
        Arrays.sort(numbers); // Now: [5, 10, 20, 30, 40]

        int secondMin = numbers[1];
        int secondMax = numbers[numbers.length - 2];

        System.out.println("Second Minimum (Sorted): " + secondMin);
        System.out.println("Second Maximum (Sorted): " + secondMax);
    }
}

