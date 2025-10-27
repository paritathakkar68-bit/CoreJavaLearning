// 1. Find Missing Elements from Array > With Method

package lecture14;

public class FindMissingElementWith
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 4, 5, 6, 8};
        printMissingElements(array, 8);
    }

    public static void printMissingElements(int[] arr, int max)
    {
        for (int num = 1; num <= max; num++)
        {
            boolean isFound = false;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == num)
                {
                    isFound = true;
                    break;
                }
            }
            if (!isFound)
            {
                System.out.println("Missing: " + num);
            }
        }
    }
}

