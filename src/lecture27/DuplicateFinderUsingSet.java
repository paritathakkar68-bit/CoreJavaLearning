//1. Find Duplicate Elements using Set

package lecture27;

import java.util.*;

public class DuplicateFinderUsingSet
{
    public static void main(String[] args)
    {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 1, 6};

        Set<Integer> seenElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int number : inputArray)
        {
            // If number already exists in set, it's a duplicate
            if (!seenElements.add(number))
            {
                duplicateElements.add(number);
            }
        }

        System.out.println("Duplicate Elements using Set: " + duplicateElements);
    }
}

