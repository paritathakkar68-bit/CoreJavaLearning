package lecture20;

public class StringCreationDemo
{
    public static void main(String[] args)
    {
        //Using character array
        char[] charArray = { 'P', 'a', 'r', 'i', 't', 'a' };
        String stringFromCharArray = new String(charArray); // convert char[] to String
        System.out.println("String from character array: " + stringFromCharArray);

        //Using 'new' keyword
        String stringUsingNewKeyword = new String("Hello Java");
        System.out.println("String using new keyword: " + stringUsingNewKeyword);

        //Using string literal
        String stringUsingLiteral = "Hello World";
        System.out.println("String using literal: " + stringUsingLiteral);

        //String concatenation
        String combinedString = stringFromCharArray + " " + stringUsingLiteral;
        System.out.println("Combined string: " + combinedString);
    }
}

