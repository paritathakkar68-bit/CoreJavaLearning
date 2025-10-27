//1. Bubble Sort With Function – Different Data

package lecture11;

public class BubbleSortExample {

    // Main method to test bubble sort
    public static void main(String[] args) {
        int[] numbers = {10, 7, 30, 2, 50, 18};  // Unsorted array
        bubbleSort(numbers);  // Calling sort method

        // Printing sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Function to sort the array using Bubble Sort
    public static void bubbleSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                // Swap if the element is greater than the next
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

