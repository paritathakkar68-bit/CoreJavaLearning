//3. Find Duplicate Elements (Brute Force) - [Without Function]

package lecture12;

public class DuplicateElementsWithoutFunction
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 9, 3, 2, 9};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    System.out.println(numbers[i]);
                    break; // to avoid printing same duplicate again
                }
            }
        }
    }
}

