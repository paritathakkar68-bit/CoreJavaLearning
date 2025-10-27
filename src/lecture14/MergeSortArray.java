// 3. Merge Two Arrays and Sort > Without Method

package lecture14;

import java.util.Arrays;

public class MergeSortArray
{
    public static void main(String[] args)
    {
        int[] a = {5, 1, 9};
        int[] b = {4, 2, 8};

        int[] merged = new int[a.length + b.length];

        // Merge both arrays
        for (int i = 0; i < a.length; i++)
        {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++)
        {
            merged[a.length + i] = b[i];
        }

        // Sort the merged array
        Arrays.sort(merged);

        System.out.println("Sorted merged array: " + Arrays.toString(merged));
    }
}

