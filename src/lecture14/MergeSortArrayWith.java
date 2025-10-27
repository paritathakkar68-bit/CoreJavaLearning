// 3. Merge Two Arrays and Sort > With Method

package lecture14;

import java.util.Arrays;

public class MergeSortArrayWith
{
    public static void main(String[] args)
    {
        int[] array1 = {5, 1, 9};
        int[] array2 = {4, 2, 8};

        int[] result = mergeAndSort(array1, array2);

        System.out.println("Merged & Sorted: " + Arrays.toString(result));
    }

    public static int[] mergeAndSort(int[] a, int[] b)
    {
        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++)
        {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++)
        {
            merged[a.length + i] = b[i];
        }

        Arrays.sort(merged);
        return merged;
    }
}

