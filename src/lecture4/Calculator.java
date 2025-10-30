//Package names should always be in lowercase
package lecture4;

//Class names should follow PascalCase (first letter capital of each word)
public class Calculator {

    //main method is the entry point of the program
    //Naming: method name is 'main' – follows camelCase convention
    public static void main(String[] args) {

        //Variable names should follow camelCase (start lowercase, then capital words)
        int firstNumber = 10;   // Descriptive variable name instead of just 'a'
        int secondNumber = 4;   // Descriptive name instead of 'b'
        char operator = '/';    // Operator to perform (+, -, *, /)

        //switch statement to perform operation based on operator
        switch (operator) {

            //case for addition
            case '+':
                // Using camelCase variables, prints sum
                System.out.println("Addition: " + (firstNumber + secondNumber));
                break;

            // case for subtraction
            case '-':
                System.out.println("Subtraction: " + (firstNumber - secondNumber));
                break;

            // case for multiplication
            case '*':
                System.out.println("Multiplication: " + (firstNumber * secondNumber));
                break;

            //  case for division with zero check
            case '/':
                // Check to avoid division by zero
                if (secondNumber != 0) {
                    System.out.println("Division: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            //  default case handles invalid operator inputs
            default:
                System.out.println("Invalid operator");
        }
    }
}
