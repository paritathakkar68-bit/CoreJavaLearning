//2. Find Common Elements in Two Arrays  > With Method

package lecture14;

public class CommonElementsWith
{
    public static void main(String[] args)
    {
        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {3, 4, 5, 9};
        printCommonElements(firstArray, secondArray);
    }

    public static void printCommonElements(int[] a, int[] b)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                    System.out.println("Common: " + a[i]);
                }
            }
        }
    }
}

