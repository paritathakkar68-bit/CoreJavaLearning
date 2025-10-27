//Package name should always be in lowercase
package lecture4;

//Class names should follow PascalCase (each word starts with a capital letter)
public class LargerOfThree
{

    //main method - the starting point of program execution
    public static void main(String[] args)
    {

        //Variable names should be in camelCase and descriptive
        int firstNumber = 30;
        int secondNumber = 20;
        int thirdNumber = 25;

        //if-else ladder to compare three numbers
        if (firstNumber > secondNumber && firstNumber > thirdNumber)
        {
            // If firstNumber is greater than both second and third
            System.out.println(firstNumber + " is the largest.");
        } else if (secondNumber > thirdNumber)
        {
            // If secondNumber is greater than thirdNumber
            System.out.println(secondNumber + " is the largest.");
        } else {
            // If thirdNumber is the greatest
            System.out.println(thirdNumber + " is the largest.");
        }
    }
}

