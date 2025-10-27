package lecture9;

public class StringArrayLoopDemo
{

    public static void main(String[] args)
    {

        // Creating a String array
        String[] fruits = {"Mango", "Orange", "Papaya"};

        // Using traditional for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < fruits.length; i++)
        {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        // Using enhanced for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String fruit : fruits)
        {
            System.out.println("Fruit: " + fruit);
        }
    }
}
