//Package name should always be in lowercase
package lecture5;

//Class name should follow PascalCase (Each word capitalized)
public class WhileExample {

    //main method – the starting point of the program
    public static void main(String[] args) {

        //Use meaningful camelCase variable names
        int counter = 1;

        //while loop checks condition before executing the block
        while (counter <= 5) {
            //Print current value of counter
            System.out.println("While Loop: " + counter);

            //Increment counter to avoid infinite loop
            counter++;
        }
    }
}

