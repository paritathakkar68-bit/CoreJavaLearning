package lecture22;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedException
{

    public static void main(String[] args)
    {
        try
        {
            // Trying to read a file named "abhi.txt"
            FileReader fileReader = new FileReader("abhi.txt");

            // If the file is found, this line will print the object reference
            System.out.println("FileReader created: " + fileReader);

        } catch (FileNotFoundException e)
        {
            // This block handles the checked exception if the file is missing
            System.out.println("File Not Found: " + e.getMessage());
        }
    }
}

