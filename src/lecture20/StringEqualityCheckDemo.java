package lecture20;

public class StringEqualityCheckDemo
{
    public static void main(String[] args)
    {
        // String literals are stored in the String Constant Pool (SCP)
        String stringOne = "Test";
        String stringTwo = "Test";

        // String created using 'new' keyword (stored in heap)
        String stringThree = new String("Test");

        // Compare memory references using '=='
        System.out.println("stringOne == stringTwo: " + (stringOne == stringTwo));   // true (same SCP object)
        System.out.println("stringOne == stringThree: " + (stringOne == stringThree)); // false (SCP vs Heap)

        // Compare values using equals() method
        System.out.println("stringOne.equals(stringTwo): " + stringOne.equals(stringTwo));   // true
        System.out.println("stringOne.equals(stringThree): " + stringOne.equals(stringThree)); // true
    }
}


