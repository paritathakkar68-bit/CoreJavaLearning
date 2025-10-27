//3. Find Duplicate Elements (Brute Force) - [With Function]

package lecture12;

public class DuplicateElementsWithFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 9, 3, 2, 9};

        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr)
    {
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    break; // to avoid repeating the same duplicate
                }
            }
        }
    }
}

