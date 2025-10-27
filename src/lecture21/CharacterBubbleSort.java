package lecture21;

public class CharacterBubbleSort
{

    public static void main(String[] args)
    {
        String input = "parita";
        char[] chars = input.toCharArray();

        // Bubble sort using compareTo (via ASCII values)
        for (int i = 0; i < chars.length - 1; i++)
        {
            for (int j = 0; j < chars.length - i - 1; j++)
            {
                if (Character.toString(chars[j]).compareTo(Character.toString(chars[j + 1])) > 0) {
                    // Swap characters
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("Sorted Characters: " + new String(chars));
    }
}

