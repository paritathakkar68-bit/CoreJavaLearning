//Java Code with All Types of Methods

package lecture15;

// Class Declaration
public class MethodTypesDemo {

    //Static Method: No Parameter, No Return Type
    static void greetUser() {
        System.out.println("Hello! Welcome to MethodTypesDemo.");
    }

    //Static Method: With Parameter and With Return Type
    static int addNumbers(int num1, int num2) {
        return num1 + num2; // returns sum
    }

    //Non-Static Method: No Parameter, With Return Type
    int getRandomNumber() {
        return 42; // dummy value
    }

    //Non-Static Method: With Parameter, No Return Type
    void printMessage(String message) {
        System.out.println("Your Message: " + message);
    }

    //Non-Static Method: With Parameter, With Return Type
    int multiplyNumbers(int a, int b) {
        return a * b;
    }

    // Main Method
    public static void main(String[] args) {
        //Calling Static Method (No param, No return)
        greetUser();

        //Calling Static Method (With param, With return)
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);

        //Creating Object to call Non-Static Methods
        MethodTypesDemo demo = new MethodTypesDemo();

        //Calling Non-Static Method (No param, With return)
        int random = demo.getRandomNumber();
        System.out.println("Random Number: " + random);

        //Calling Non-Static Method (With param, No return)
        demo.printMessage("Java is awesome!");

        //Calling Non-Static Method (With param, With return)
        int product = demo.multiplyNumbers(5, 4);
        System.out.println("Product: " + product);
    }
}
