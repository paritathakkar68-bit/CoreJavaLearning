package lecture7;

/**
 * This class prints a square pattern using a function.
 */
public class SquarePatternWithFunction
{

    /**
     * Prints a square pattern of stars.
     * @param size The number of rows and columns in the square.
     */
    static void printSquarePattern(int size)
    {

        // Outer loop for each row
        for (int row = 1; row <= size; row++)
        {

            // Inner loop to print stars in each column
            for (int column = 1; column <= size; column++)
            {
                System.out.print("* ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        int squareSize = 5;  // Size of the square (rows and columns)

        // Call the function to print the square pattern
        printSquarePattern(squareSize);
    }
}
