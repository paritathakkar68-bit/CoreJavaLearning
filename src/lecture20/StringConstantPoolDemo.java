package lecture20;

public class StringConstantPoolDemo
{
    public static void main(String[] args)
    {
        // String literal (stored in SCP)
        String literalString1 = "Java";
        String literalString2 = "Java";

        // Created using 'new' keyword (stored in heap)
        String newString1 = new String("Java");
        String newString2 = new String("Java");

        // Compare memory reference using '=='
        System.out.println("literalString1 == literalString2: " + (literalString1 == literalString2)); // true
        System.out.println("newString1 == newString2: " + (newString1 == newString2)); // false
        System.out.println("literalString1 == newString1: " + (literalString1 == newString1)); // false

        // Compare values using equals()
        System.out.println("literalString1.equals(newString1): " + literalString1.equals(newString1)); // true
    }
}

