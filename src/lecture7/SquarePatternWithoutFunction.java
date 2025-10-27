package lecture7;

/**
 * This class prints a square pattern without using a separate method.
 */
public class SquarePatternWithoutFunction
{

    public static void main(String[] args)
    {

        int squareSize = 5;  // Define the number of rows and columns in the square

        // Outer loop to handle the number of rows
        for (int row = 1; row <= squareSize; row++)
        {

            // Inner loop to print stars for each column in the row
            for (int column = 1; column <= squareSize; column++)
            {
                System.out.print("* ");
            }

            // Move to the next line after printing one full row
            System.out.println();
        }
    }
}


