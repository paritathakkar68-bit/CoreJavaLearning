package lecture7;

/**
 * This class prints an inverted triangle pattern using a function.
 */
public class InvertedTriangleWithFunction {

    /**
     * Prints an inverted right-angled triangle pattern of stars.
     * @param totalRows The number of rows in the triangle.
     */
    static void printInvertedTriangle(int totalRows) {

        // Outer loop for each row (from totalRows down to 1)
        for (int row = totalRows; row >= 1; row--) {

            // Inner loop to print stars in each row
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            // Move to the next line after printing stars of one row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int numberOfRows = 5;  // Define number of rows for the pattern

        // Call the function to print the inverted triangle
        printInvertedTriangle(numberOfRows);
    }
}
