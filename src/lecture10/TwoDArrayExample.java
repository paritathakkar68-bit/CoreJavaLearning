
// 1) 2D array creation / declaration/intilisation

package lecture10;

public class TwoDArrayExample
{
    public static void main(String[] args)
    {
        // Declare, create and initialize 2D array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        // Printing elements
        System.out.println("2D Array Elements:");
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);
    }
}

/*
Output:-
2D Array Elements:
1 2
3 4
*/

