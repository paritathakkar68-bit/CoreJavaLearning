//2. Find Duplicate Elements using HashMap

package lecture27;

import java.util.*;

public class DuplicateFinderUsingHashMap
{
    public static void main(String[] args)
    {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 1, 6};

        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Count frequency of each element
        for (int number : inputArray)
        {
            elementCountMap.put(number, elementCountMap.getOrDefault(number, 0) + 1);
        }

        System.out.print("Duplicate Elements using HashMap: ");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

