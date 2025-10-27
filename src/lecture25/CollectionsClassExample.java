package lecture25;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassExample
{

    public static void main(String[] args)
    {

        //Create an ArrayList of integers
        ArrayList<Integer> numberList = new ArrayList<>();

        //Add elements to the list
        numberList.add(45);
        numberList.add(10);
        numberList.add(78);
        numberList.add(32);
        numberList.add(90);

        System.out.println("Original List: " + numberList);

        // 1. sort() - Sort the list in ascending order
        Collections.sort(numberList);
        System.out.println("After sort(): " + numberList);

        // 2. reverse() - Reverse the order of elements
        Collections.reverse(numberList);
        System.out.println("After reverse(): " + numberList);

        // 3. min() - Find the minimum element
        int minValue = Collections.min(numberList);
        System.out.println("Minimum value: " + minValue);

        // 4. max() - Find the maximum element
        int maxValue = Collections.max(numberList);
        System.out.println("Maximum value: " + maxValue);
    }
}

