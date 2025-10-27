package lecture24;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationHandler
{

    // Method to write key-value pairs to a .properties file
    public static void writeToPropertiesFile(String filePath, String key, String value) {
        Properties configProps = new Properties();

        try
        {
            // Load existing file if it exists
            FileInputStream input = new FileInputStream(filePath);
            configProps.load(input);
            input.close();

        } catch (IOException e)
        {
            // If file doesn't exist, it's okay to continue and create a new one
            System.out.println("Creating new properties file...");
        }

        try
        {
            // Set the property and save to file
            configProps.setProperty(key, value);
            FileOutputStream output = new FileOutputStream(filePath);
            configProps.store(output, "Application Configuration Settings");
            output.close();

            System.out.println("Configuration saved successfully.");

        } catch (IOException e)
        {
            System.out.println("Failed to save configuration.");
            e.printStackTrace();
        }
    }

    // Method to read and display all properties from the file
    public static void readFromPropertiesFile(String filePath)
    {
        Properties configProps = new Properties();

        try
        {
            FileInputStream input = new FileInputStream(filePath);
            configProps.load(input);
            input.close();

            System.out.println("Loaded Configuration:");
            for (String key : configProps.stringPropertyNames())
            {
                System.out.println(key + " = " + configProps.getProperty(key));
            }

        } catch (IOException e)
        {
            System.out.println("Failed to read configuration.");
            e.printStackTrace();
        }
    }

    // Main method to test write and read
    public static void main(String[] args) {
        String configFilePath = "C:\\Users\\Dell\\Desktop\\sample_output.txt";

        // Write config entries
        writeToPropertiesFile(configFilePath, "app.name", "StudentManager");
        writeToPropertiesFile(configFilePath, "app.version", "1.0.1");
        writeToPropertiesFile(configFilePath, "app.author", "Parita Thakkar");

        // Read and display entries
        readFromPropertiesFile(configFilePath);
    }
}

