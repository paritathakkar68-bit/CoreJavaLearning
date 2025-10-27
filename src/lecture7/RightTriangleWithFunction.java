package lecture7;

/**
 * This class prints a right-angled triangle pattern using a function.
 */
public class RightTriangleWithFunction
{

    /**
     * Prints a right-angled triangle pattern of stars.
     * @param totalRows The number of rows in the triangle.
     */
    static void printRightTriangle(int totalRows)
    {

        // Outer loop to handle the number of rows
        for (int row = 1; row <= totalRows; row++)
        {

            // Inner loop to print stars for each row
            for (int column = 1; column <= row; column++)
            {
                System.out.print("* ");
            }

            // Move to the next line after printing stars of one row
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        int numberOfRows = 5;  // Define how many rows the triangle should have

        // Call the function to print the triangle pattern
        printRightTriangle(numberOfRows);
    }
}
