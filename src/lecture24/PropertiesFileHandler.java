package lecture24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandler
{

    // Generic method to write a key-value pair to a .properties file
    public static void writeToPropertiesFile(String filePath, String key, String value)
    {
        Properties properties = new Properties();
        try
        {
            // Load existing file if it exists
            FileInputStream input = new FileInputStream(filePath);
            properties.load(input);
            input.close();
        } catch (IOException e)
        {
            // File may not exist initially, ignore
        }

        try
        {
            // Set new property
            properties.setProperty(key, value);

            // Save properties to file
            FileOutputStream output = new FileOutputStream(filePath);
            properties.store(output, "Updated Properties File");
            output.close();
            System.out.println("Property saved: " + key + "=" + value);
        } catch (IOException e)
        {
            System.out.println("Error writing to properties file: " + e.getMessage());
        }
    }

    // Generic method to read a value from a .properties file
    public static String readFromPropertiesFile(String filePath, String key)
    {
        Properties properties = new Properties();
        try
        {
            FileInputStream input = new FileInputStream(filePath);
            properties.load(input);
            input.close();
            String value = properties.getProperty(key);
            return value != null ? value : "🔍 Key not found!";
        } catch (IOException e) {
            return "Error reading properties file: " + e.getMessage();
        }
    }

    public static void main(String[] args)
    {
        String filePath = "config.properties";
        String key = "username";
        String value = "admin123";

        writeToPropertiesFile(filePath, key, value);  // Write key-value
        String readValue = readFromPropertiesFile(filePath, key);  // Read key

        System.out.println("Value for key '" + key + "': " + readValue);
    }
}

