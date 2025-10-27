//Package name should always be in lowercase
package lecture5;

//Class name should follow PascalCase (Each word starts with a capital letter)
public class DoWhileExample
{

    //main method – the entry point of the program
    public static void main(String[] args)
    {

        //Variable name should follow camelCase and be meaningful
        int counter = 1;

        //do-while loop runs at least once before checking the condition
        do
        {
            //Print current value of counter
            System.out.println("Do-While Loop: " + counter);

            //Increment the counter in each iteration
            counter++;

        } while (counter <= 5); //Loop continues while condition is true
    }
}


