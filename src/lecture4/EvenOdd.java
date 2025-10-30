//Package name should always be in lowercase
package lecture4;

//Class name should follow PascalCase (each word starts with capital letter)
public class EvenOdd
{

    //main method is the entry point of the program
    //Naming: 'main' follows camelCase (starts with lowercase)
    public static void main(String[] args)
    {

        //Variable names should be in camelCase (descriptive & lowercase first letter)
        int inputNumber = 9; // Replaced 'num' with 'inputNumber' for clarity

        //if condition checks whether the number is divisible by 2
        if (inputNumber % 2 == 0)
        {
            // If number is divisible by 2 → it's even
            System.out.println(inputNumber + " is Even.");
        } else
        {
            // If not divisible by 2 → it's odd
            System.out.println(inputNumber + " is Odd.");
        }
    }
}
