//1. Find Max and Min in Array - [With Function]

package lecture12;

public class MaxMinWithFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 9, 2, 7};

        System.out.println("Maximum: " + findMax(numbers));
        System.out.println("Minimum: " + findMin(numbers));
    }

    public static int findMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}

