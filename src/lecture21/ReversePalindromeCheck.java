package lecture21;

public class ReversePalindromeCheck
{

    public static void main(String[] args)
    {
        String original = "parita";
        String reversed = "";

        // Reversing the string using charAt()
        for (int i = original.length() - 1; i >= 0; i--)
        {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Checking for palindrome
        if (original.equals(reversed))
        {
            System.out.println("The string is a Palindrome.");
        } else
        {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}
