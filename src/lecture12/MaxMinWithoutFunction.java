//1. Find Max and Min in Array - [WithoutFunction]

package lecture12;

public class MaxMinWithoutFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 9, 2, 7};

        int max = numbers[0];
        int min = numbers[0];

        // Traverse the array to find max and min
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
            if (numbers[i] < min)
            {
                min = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

