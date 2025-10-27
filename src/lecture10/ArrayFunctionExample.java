
// 5) Call this function using anonymous array and without anynomously

package lecture10;


// Java program to demonstrate calling a function using anonymous and non-anonymous arrays
public class ArrayFunctionExample
{

    // Function to print a 1D array
    static void printArray(int[] numbers)
    {
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println(); // for new line
    }

    public static void main(String[] args)
    {

        // Calling function using a non-anonymous array (regular array)
        int[] regularArray = {10, 20, 30, 40, 50};
        System.out.println("Printing using non-anonymous array:");
        printArray(regularArray); // function call with named array

        // Calling function using an anonymous array (created during the call)
        System.out.println("Printing using anonymous array:");
        printArray(new int[] {1, 2, 3, 4, 5}); // function call with anonymous array
    }
}


/*
Output:-
Printing using non-anonymous array:
        10 20 30 40 50
Printing using anonymous array:
        1 2 3 4 5
 */