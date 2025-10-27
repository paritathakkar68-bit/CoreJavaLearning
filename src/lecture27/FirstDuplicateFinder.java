//3. Find First Duplicate Element using HashSet or HashMap

package lecture27;

import java.util.*;

public class FirstDuplicateFinder
{
    public static void main(String[] args)
    {
        int[] inputArray = {3, 5, 4, 2, 3, 1, 4};

        Set<Integer> seenNumbers = new HashSet<>();
        int firstDuplicate = -1;

        for (int number : inputArray) {
            if (!seenNumbers.add(number)) {
                firstDuplicate = number;
                break;
            }
        }

        if (firstDuplicate != -1)
        {
            System.out.println("First Duplicate Element is: " + firstDuplicate);
        } else
        {
            System.out.println("No duplicate element found.");
        }
    }
}

