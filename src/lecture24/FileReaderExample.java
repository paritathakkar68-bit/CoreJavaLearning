package lecture24;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample
{

    public static void main(String[] args)
    {

        // Full path of the file to be read
        String filePath = "C:\\Users\\Dell\\Desktop\\sample_output.txt";

        // Use try-with-resources to auto-close FileReader
        try (FileReader fileReader = new FileReader(filePath))
        {

            int character;

            // Read and print characters one by one
            while ((character = fileReader.read()) != -1)
            {
                System.out.print((char) character);
            }

            // Optional: Add a newline after file content
            System.out.println("\nFile reading completed successfully.");

        } catch (IOException e)
        {
            // Handle errors gracefully
            System.out.println("Error reading the file. Check file path or permissions.");
            e.printStackTrace();
        }
    }
}
