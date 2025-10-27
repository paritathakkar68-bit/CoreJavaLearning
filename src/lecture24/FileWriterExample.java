package lecture24;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample
{

    public static void main(String[] args)
    {

        // Define the full file path including file name
        String filePath = "C:\\Users\\Dell\\Desktop\\sample_output.txt";

        try
        {
            // Create FileWriter object to write data to the specified file
            FileWriter fileWriter = new FileWriter(filePath);

            // Write content to the file
            fileWriter.write("This text is written using FileWriter in Java.");

            // Close the FileWriter to release system resources
            fileWriter.close();

            // Confirmation message on successful write
            System.out.println("File written successfully at: " + filePath);

        } catch (IOException e)
        {
            // Handle exceptions such as file not found or access issues
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
