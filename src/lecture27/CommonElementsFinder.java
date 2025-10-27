//4. Find Common Elements in ArrayList and HashMap

package lecture27;

import java.util.*;

public class CommonElementsFinder
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(3, "Three");
        numberMap.put(5, "Five");
        numberMap.put(7, "Seven");

        List<Integer> commonElements = new ArrayList<>();

        for (Integer number : numberList)
        {
            if (numberMap.containsKey(number))
            {
                commonElements.add(number);
            }
        }

        System.out.println("Common Elements between ArrayList and HashMap: " + commonElements);
    }
}

