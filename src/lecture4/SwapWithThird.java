//Package name should always be in lowercase
package lecture4;

//Class name should follow PascalCase (Each word starts with a capital letter)
public class SwapWithThird
{

    //main method – entry point of the program
    public static void main(String[] args)
    {

        //Variable names should be meaningful and follow camelCase
        int firstNumber = 5;
        int secondNumber = 10;
        int tempVariable; // Used for swapping (3rd variable)

        //Swapping values using a third (temporary) variable
        tempVariable = firstNumber;   // Store original firstNumber
        firstNumber = secondNumber;   // Assign secondNumber to firstNumber
        secondNumber = tempVariable;  // Assign original firstNumber back to secondNumber

        //Print the result after swapping
        System.out.println("After Swap: a = " + firstNumber + ", b = " + secondNumber);
    }
}