package lecture11;

// InsertionSortWithMain.java
public class InsertionSortWithMain {

    // Function to perform insertion sort
    public static void performInsertionSort(int[] array) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key; // Place key at correct position
        }
    }

    // Function to print array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] numbers = { 9, 5, 1, 4, 3 };

        System.out.println("Original array:");
        printArray(numbers);

        performInsertionSort(numbers);

        System.out.println("Sorted array using Insertion Sort:");
        printArray(numbers);
    }
}

