//Package name should always be in lowercase
package lecture4;

//Class name should follow PascalCase (Each word starts with a capital letter)
public class LargerOfTwo
{

    //main method: program entry point, uses camelCase
    public static void main(String[] args)
    {

        //Variable names should follow camelCase and be descriptive
        int firstNumber = 10;
        int secondNumber = 20;

        //if-else condition to compare two numbers
        if (firstNumber > secondNumber)
        {
            // If firstNumber is greater, print it
            System.out.println(firstNumber + " is larger.");
        } else
        {
            // Otherwise, secondNumber is larger
            System.out.println(secondNumber + " is larger.");
        }
    }
}
