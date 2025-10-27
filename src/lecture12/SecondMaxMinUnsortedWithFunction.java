//2. Without Sorting  -  [With Function]

package lecture12;

public class SecondMaxMinUnsortedWithFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 5, 40, 30};

        System.out.println("Second Maximum (Unsorted): " + findSecondMax(numbers));
        System.out.println("Second Minimum (Unsorted): " + findSecondMin(numbers));
    }

    // Function to find second max without sorting
    public static int findSecondMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr)
        {
            if (num > max)
            {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max)
            {
                secondMax = num;
            }
        }
        return secondMax;
    }

    // Function to find second min without sorting
    public static int findSecondMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr)
        {
            if (num < min)
            {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min)
            {
                secondMin = num;
            }
        }
        return secondMin;
    }
}

