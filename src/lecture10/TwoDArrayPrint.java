
//2) 2D array printing using bot lops (for and for each loops)

package lecture10;

public class TwoDArrayPrint
{
    public static void main(String[] args)
    {
        int[][] numbers =
                {
                {10, 20},
                {30, 40}
                };

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (int[] row : numbers)
        {
            for (int num : row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:-
Using for loop:
10 20
30 40
Using for-each loop:
10 20
30 40
*/

