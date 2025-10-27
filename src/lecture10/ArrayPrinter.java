
//4 ) create 2 function for printing array of 1-d and 2-d - check again

package lecture10;

public class ArrayPrinter {

    // Function to print a 1D array
    public static void printOneDimensionalArray(int[] array) {
        System.out.println("1D Array Elements:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // For new line
    }

    // Function to print a 2D array
    public static void printTwoDimensionalArray(int[][] array) {
        System.out.println("2D Array Elements:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to next row
        }
    }

    // Main method to test the functions
    public static void main(String[] args) {
        // Creating a 1D array
        int[] numbers1D = {5, 10, 15};

        // Creating a 2D array
        int[][] numbers2D = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Calling functions with arrays
        printOneDimensionalArray(numbers1D);
        printTwoDimensionalArray(numbers2D);
    }
}

/*
Output:-
1D Array Elements:
5 10 15
2D Array Elements:
1 2
3 4
5 6
*/