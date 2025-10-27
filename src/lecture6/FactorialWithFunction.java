//Package names should always be in lowercase
package lecture6;

//Class names should follow PascalCase (Each word starts with a capital letter)
public class FactorialWithFunction {

    //Method to calculate factorial
    //Method name uses camelCase, and parameter name is descriptive
    static int calculateFactorial(int number) {
        int factorialResult = 1;  //Use meaningful variable name

        //Loop from 1 to number to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorialResult *= i;
        }

        return factorialResult;
    }

    //main method – the entry point of the program
    public static void main(String[] args) {

        //Variable name should be meaningful and in camelCase
        int inputNumber = 5;

        //Print the factorial using function call
        System.out.println("Factorial of " + inputNumber + " is " + calculateFactorial(inputNumber));
    }
}
