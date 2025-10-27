package lecture26;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo{
    public static void main(String[] args) {
        // Create LinkedList of type Object
        LinkedList<Object> items = new LinkedList<>();

        // Add elements without using add()
        items.addLast("Laptop");
        items.addLast("Mouse");
        items.addLast(42);
        items.addLast(89.6f);

        // Add at first and last
        items.addFirst("Charger");
        items.addLast("Keyboard");

        System.out.println(items);
        // Output: [Charger, Laptop, Mouse, 42, 89.6, Keyboard]

        // Insert at specific index
        items.add(2, "Speaker");
        System.out.println(items);
        // Output: [Charger, Laptop, Speaker, Mouse, 42, 89.6, Keyboard]

        // Remove element at index 3
        items.remove(3);
        System.out.println(items);
        // Output: [Charger, Laptop, Speaker, 42, 89.6, Keyboard]

        // Get element at index 2
        System.out.println(items.get(2));  // Output: Speaker

        // Update element at index 3
        items.set(3, "Monitor");
        System.out.println(items);
        // Output: [Charger, Laptop, Speaker, Monitor, 89.6, Keyboard]

        // ----------- Print using for loop -----------
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        // ----------- Print using for-each loop -----------
        System.out.println("\nUsing for-each loop:");
        for (Object element : items) {
            System.out.println(element);
        }

        // ----------- Print using Iterator -----------
        System.out.println("\nUsing iterator:");
        Iterator<Object> itr = items.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

