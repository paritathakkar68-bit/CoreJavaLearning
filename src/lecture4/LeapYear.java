//Package name should always be lowercase
package lecture4;

//Class name should follow PascalCase (each word starts with a capital letter)
public class LeapYear
{

    //main method is the entry point of the program
    //Method name 'main' follows camelCase
    public static void main(String[] args)
    {

        //Variable name follows camelCase and is descriptive
        int inputYear = 2024;

        //Leap year logic:
        // - Divisible by 4 AND not divisible by 100
        // - OR divisible by 400
        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0)
        {
            // If above condition is true, it's a leap year
            System.out.println(inputYear + " is a Leap Year.");
        } else
        {
            // Otherwise, not a leap year
            System.out.println(inputYear + " is not a Leap Year.");
        }
    }
}
