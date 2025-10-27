package lecture7;

/**
 * This class prints an inverted right-angled triangle pattern without using a method.
 */
public class InvertedTriangleWithoutFunction
{

    public static void main(String[] args)
    {

        int totalRows = 5;  // Number of rows in the triangle

        // Outer loop for each row, starting from totalRows down to 1
        for (int row = totalRows; row >= 1; row--)
        {

            // Inner loop to print stars for each row
            for (int column = 1; column <= row; column++)
            {
                System.out.print("* ");
            }

            // Move to next line after printing one row of stars
            System.out.println();
        }
    }
}


