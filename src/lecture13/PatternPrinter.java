package lecture13;

// Utility class for loop-based patterns and number series
public class PatternPrinter
{

    // Print a right-angled triangle using stars
    public static void displayRightAngledTriangle(int totalRows)
    {
        for (int i = 1; i <= totalRows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print multiplication table for a given number
    public static void printMultiplicationTable(int number)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Print N even numbers starting from 2
    public static void printEvenSeries(int count)
    {
        int num = 2;
        for (int i = 1; i <= count; i++)
        {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
    }

    // Print N odd numbers starting from 1
    public static void printOddSeries(int count)
    {
        int num = 1;
        for (int i = 1; i <= count; i++)
        {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
    }
}

