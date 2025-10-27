package lecture11;

public class InsertionSort {

    // Insertion Sort implemented inside main method
    public static void main(String[] args) {

        // Initial unsorted array
        int[] numbers = {8, 4, 10, 2, 6, 1};
        int length = numbers.length;

        // Outer loop goes through each element starting from index 1
        for (int i = 1; i < length; i++) {
            int current = numbers[i];
            int j = i - 1;

            // Shift elements of the sorted part to the right
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // Insert the current element at the right position
            numbers[j + 1] = current;
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

