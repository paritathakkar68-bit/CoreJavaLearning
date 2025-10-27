package lecture25;

import java.util.ArrayList;

public class ArrayListMethodsExample
{

    public static void main(String[] args)
    {

        //Create an ArrayList of fruits
        ArrayList<String> fruitList = new ArrayList<>();

        // 1. add() - Add elements to the list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Mango");
        System.out.println("After add(): " + fruitList);

        // 2. addAll() - Add multiple elements from another list
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Guava");

        fruitList.addAll(moreFruits);
        System.out.println("After addAll(): " + fruitList);

        // 3. remove() - Remove a specific element
        fruitList.remove("Banana");
        System.out.println("After remove(\"Banana\"): " + fruitList);

        // 4. removeAll() - Remove all elements of another list
        fruitList.removeAll(moreFruits);
        System.out.println("After removeAll(moreFruits): " + fruitList);

        // 5. contains() - Check if an element is present
        boolean hasMango = fruitList.contains("Mango");
        System.out.println("Contains 'Mango': " + hasMango);

        // 6. size() - Get the number of elements
        int totalFruits = fruitList.size();
        System.out.println("Size of fruitList: " + totalFruits);
    }
}

