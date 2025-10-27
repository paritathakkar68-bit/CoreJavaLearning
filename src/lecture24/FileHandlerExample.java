package lecture24;

import java.io.File;
import java.io.IOException;

public class FileHandlerExample
{

    public static void main(String[] args)
    {

        // Full file path to be created
        String filePath = "C:\\Users\\Dell\\Desktop\\sample_output.txt";

        // Create File object
        File file = new File(filePath);

        try
        {
            // Ensure parent directories exist
            File parentDir = file.getParentFile();
            if (!parentDir.exists())
            {
                if (parentDir.mkdirs())
                {
                    System.out.println("Created missing directories.");
                } else
                {
                    System.out.println("Failed to create directories. Aborting...");
                    return;
                }
            }

            // Attempt to create the file
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            } else
            {
                System.out.println("File already exists.");
            }

            // Display file properties
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("File length (bytes): " + file.length());
            System.out.println("Exists: " + file.exists());

        } catch (IOException e)
        {
            // Handle IO errors
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }
    }
}
