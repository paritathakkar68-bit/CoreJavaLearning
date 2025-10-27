package lecture7;

/**
 * This class prints a right-angled triangle pattern without using a method.
 */
public class RightTriangleWithoutFunction
{

    public static void main(String[] args)
    {

        int totalRows = 5;  // Define the number of rows for the triangle

        // Outer loop to handle the number of rows
        for (int row = 1; row <= totalRows; row++)
        {

            // Inner loop to print stars for each row
            for (int column = 1; column <= row; column++)
            {
                System.out.print("* ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }
}
