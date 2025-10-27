//Package names should be in lowercase
package lecture4;

//Class names should use PascalCase (Each Word Capitalized)
public class JavaPrograms
{

    //Method to find larger of two numbers
    //Naming: method - camelCase, variables - meaningful & camelCase
    static void findLargerOfTwo(int firstNumber, int secondNumber)
    {
        if (firstNumber > secondNumber)
            System.out.println("Larger number is: " + firstNumber);
        else
            System.out.println("Larger number is: " + secondNumber);
    }

    //Method to find largest among three numbers
    static void findLargerOfThree(int firstNumber, int secondNumber, int thirdNumber)
    {
        if (firstNumber > secondNumber && firstNumber > thirdNumber)
            System.out.println("Largest number is: " + firstNumber);
        else if (secondNumber > thirdNumber)
            System.out.println("Largest number is: " + secondNumber);
        else
            System.out.println("Largest number is: " + thirdNumber);
    }

    //Method to check if number is even or odd
    static void checkEvenOdd(int number)
    {
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }

    //Method to check if a year is a leap year
    static void checkLeapYear(int year)
    {
        //Leap year: divisible by 4 and not 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");
    }

    //Method to swap two numbers using third variable
    static void swapWithThird(int firstNumber, int secondNumber)
    {
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("Swapped (with 3rd var): a = " + firstNumber + ", b = " + secondNumber);
    }

    //Method to swap two numbers without using third variable
    static void swapWithoutThird(int firstNumber, int secondNumber)
    {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("Swapped (without 3rd var): a = " + firstNumber + ", b = " + secondNumber);
    }

    //Simple calculator using switch-case
    static void calculator(int firstNumber, int secondNumber, char operator)
    {
        switch (operator) {
            case '+':
                System.out.println("Addition = " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Subtraction = " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Multiplication = " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0)
                    System.out.println("Division = " + (firstNumber / secondNumber));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }

    //Main method to call all above methods
    public static void main(String[] args)
    {

        //Function calls with sample inputs
        findLargerOfTwo(10, 20);               // Should return 20
        findLargerOfThree(15, 25, 5);  // Should return 25
        checkEvenOdd(9);                       // Should return Odd
        checkLeapYear(2024);                   // Should return Leap Year
        swapWithThird(5, 10);                  // Should swap and print
        swapWithoutThird(7, 3);                // Should swap and print
        calculator(12, 4, '*');   // Should return 48
    }

}

