// 2. Linear Search With Function

package lecture11;

public class LinearSearchFunction {

    public static void main(String[] args) {
        int[] rollNumbers = {11, 44, 33, 22, 55};
        int target = 22;

        int foundIndex = searchElement(rollNumbers, target);  // Searching target value
        System.out.println("Element found at index: " + foundIndex);
    }

    // Function to perform linear search
    public static int searchElement(int[] data, int valueToFind) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == valueToFind) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}

