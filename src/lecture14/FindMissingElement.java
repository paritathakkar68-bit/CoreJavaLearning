//1. Find Missing Elements from Array > Without Method

package lecture14;

public class FindMissingElement
{
    public static void main(String[] args)
    {
        int[] inputArray = {1, 2, 4, 5, 6, 8};
        int max = 8;

        System.out.println("Missing elements:");
        for (int number = 1; number <= max; number++)
        {
            boolean found = false;
            for (int i = 0; i < inputArray.length; i++)
            {
                if (inputArray[i] == number)
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                System.out.println(number);
            }
        }
    }
}

