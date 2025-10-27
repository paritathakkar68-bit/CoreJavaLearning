//Package name should always be lowercase
package lecture6;

//Class name should follow PascalCase (Each word capitalized)
public class FactorialWithoutFunction {

    //main method – entry point of the program
    public static void main(String[] args) {

        //Variable names should be descriptive and in camelCase
        int inputNumber = 5;
        int factorialResult = 1;

        //Loop from 1 to inputNumber to calculate factorial
        for (int counter = 1; counter <= inputNumber; counter++) {
            factorialResult *= counter;  // Multiply current factorial by loop counter
        }

        //Output the final result
        System.out.println("Factorial of " + inputNumber + " is " + factorialResult);
    }
}