package lecture6;

/**
 * This class prints the multiplication table of a number without using a method.
 */
public class TableWithoutFunction
{

    public static void main(String[] args)
    {

        // Declare and initialize the number for which the table is to be printed
        int number = 5;

        // Loop from 1 to 10 to print the multiplication table
        for (int multiplier = 1; multiplier <= 10; multiplier++)
        {
            // Print the multiplication result in the format: number x multiplier = result
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
        }
    }
}


