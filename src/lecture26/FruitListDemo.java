//HashSetDemo

package lecture26;

import java.util.ArrayList;
import java.util.List;

public class FruitListDemo
{
    public static void main(String[] args)
    {
        // Creating a list to store fruits and values
        List<Object> list = new ArrayList<>();

        list.add("Banana");
        list.add("Mango");
        list.add(55);
        list.add(55.5);

        // Add element at specific index
        list.add("Grapes");
        System.out.println(list);

        // Remove element by value
        list.remove((Object)55);
        System.out.println(list);

        // Create second list and copy all elements from the first
        List<Object> list1 = new ArrayList<>();
        list1.addAll(list);

        // Create third list and add everything from list1 twice
        List<Object> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(list1);

        // Print final list
        System.out.println(list2);
    }
}

