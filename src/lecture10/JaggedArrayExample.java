
// 3) create jagged array and assign values in it

package lecture10;

public class JaggedArrayExample
{
    public static void main(String[] args)
    {
        // Jagged array (rows of different lengths)
        int[][] jagged = new int[2][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};

        // Print jagged array
        for (int i = 0; i < jagged.length; i++)
        {
            for (int j = 0; j < jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:-
1 2
3 4 5
*/

