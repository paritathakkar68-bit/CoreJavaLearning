package lecture24;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerExamples
{

    // Method to write content to a file
    public static void writeToFile(String filePath, String content)
    {
        try
        {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content); // Write data to file
            writer.close();
            System.out.println("File written successfully at: " + filePath);
        } catch (IOException e)
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    public static void readFromFile(String filePath)
    {
        try
        {
            FileReader reader = new FileReader(filePath);
            int character;
            System.out.println("File Content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print each character
            }
            reader.close();
        } catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        String filePath = "sample.txt";
        String data = "Hello, this is a test file.\nWelcome to Java File Handling.";

        writeToFile(filePath, data);  // Write data to file
        readFromFile(filePath);       // Read data from file
    }
}


