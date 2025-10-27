//Package names should always be in lowercase
package lecture5;

//Class names should follow PascalCase (Each word starts with a capital letter)
public class ForEachExample {

    //main method – entry point of the program
    public static void main(String[] args) {

        //Array variable name should be meaningful and in camelCase
        String[] colorList = {"Pink", "Black", "White"};

        //Enhanced for-loop (for-each) used for iterating over arrays
        //'color' is the current element during each loop iteration
        for (String color : colorList) {
            System.out.println("For-Each Loop: " + color);
        }
    }
}


