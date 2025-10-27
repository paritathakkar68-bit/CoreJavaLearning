package lecture20;

public class ImmutableStringExample
{
    public static void main(String[] args)
    {
        // Create a string literal (stored in String Constant Pool)
        String originalName = "Java";

        // Try to modify it using concat() - no change unless reassigned
        originalName.concat(" Programming"); // This does NOT change the original string

        // Print the original string to show it is unchanged
        System.out.println("Original Name: " + originalName); // Output: Java

        // Now store the result of concat() into a new string
        String updatedName = originalName.concat(" Programming");

        // Print the new string to show the concatenated result
        System.out.println("Updated Name: " + updatedName); // Output: Java Programming
    }
}

