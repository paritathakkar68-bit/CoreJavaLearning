//4. Bubble Sort Without Function

package lecture11;

public class SimpleBubbleSort {

    public static void main(String[] args) {
        int[] scores = {66, 45, 20, 89, 5};

        int n = scores.length;
        // Sorting logic directly in main
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}

