//Package name should always be in lowercase
package lecture4;

//Class name should follow PascalCase (Each word capitalized)
public class SwapWithoutThird {

    //main method is the entry point of the program
    public static void main(String[] args) {

        //Variable names should be meaningful and in camelCase
        int firstNumber = 5;
        int secondNumber = 10;

        //Swapping without using a third variable
        // Step 1: Add both numbers and store in firstNumber
        firstNumber = firstNumber + secondNumber; // 5 + 10 = 15

        // Step 2: Subtract secondNumber from the new firstNumber → gives original firstNumber
        secondNumber = firstNumber - secondNumber; // 15 - 10 = 5

        // Step 3: Subtract updated secondNumber from the new firstNumber → gives original secondNumber
        firstNumber = firstNumber - secondNumber; // 15 - 5 = 10

        //Print result after swapping
        System.out.println("After Swap: a = " + firstNumber + ", b = " + secondNumber);
    }
}
