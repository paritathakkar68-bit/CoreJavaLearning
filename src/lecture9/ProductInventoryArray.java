package lecture9;

public class ProductInventoryArray
{
    public static void main(String[] args)
    {
        // Arrays representing product information
        int[] productIds = {201, 202, 203};
        String[] productNames = {"Laptop", "Smartphone", "Tablet"};
        char[] productCategory = {'E', 'M', 'E'};
        double[] productPrices = {45000.99, 22000.50, 15000.00};
        boolean[] isInStock = {true, false, true};

        // Print all product data using for loop
        for (int i = 0; i < productIds.length; i++)
        {
            System.out.println("Product ID: " + productIds[i] +
                    " | Name: " + productNames[i] + " (" + productCategory[i] + ")" +
                    " | Price: ₹" + productPrices[i] +
                    " | In Stock: " + isInStock[i]);
        }
    }
}

