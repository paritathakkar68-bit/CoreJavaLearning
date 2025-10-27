//2. Without Sorting - [Without Function]

package lecture12;

public class SecondMaxMinUnsortedWithoutFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 5, 40, 30};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Loop to find max, second max, min, second min
        for (int num : numbers)
        {
            // For max and second max
            if (num > max)
            {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max)
            {
                secondMax = num;
            }

            // For min and second min
            if (num < min)
            {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min)
            {
                secondMin = num;
            }
        }

        System.out.println("Second Maximum (Unsorted): " + secondMax);
        System.out.println("Second Minimum (Unsorted): " + secondMin);
    }
}

