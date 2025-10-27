package lecture23;

public class ExceptionHandlingDemo
{

    // Method that throws an exception using the 'throws' keyword
    public static void validateAge(int age) throws IllegalArgumentException
    {
        if (age < 18)
        {
            // Manually throw an exception using 'throw'
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else
        {
            System.out.println("Age is valid. Access granted.");
        }
    }

    public static void main(String[] args)
    {
        try {
            // ===== try block to catch risky code =====
            int result = 10 / 2; // Change to 0 to test ArithmeticException
            System.out.println("Division Result: " + result);

            // Calling method that can throw an exception
            validateAge(16);  // Change to 20 to avoid exception

        } catch (ArithmeticException e)
        {
            // ===== catch block for ArithmeticException =====
            System.out.println("Arithmetic Error: " + e.getMessage());

        } catch (IllegalArgumentException e)
        {
            // ===== catch block for IllegalArgumentException =====
            System.out.println("Validation Error: " + e.getMessage());

        } finally
        {
            // ===== finally block always runs =====
            System.out.println("Execution completed. Closing resources if any.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

