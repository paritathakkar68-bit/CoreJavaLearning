package lecture13;

public class MainProgram
{
    public static void main(String[] args)
    {
        int[] inputArray = {12, 3, 45, 7, 23};

        System.out.println("Maximum Value: " + NumberUtils.findMaximum(inputArray));
        System.out.println("Minimum Value: " + NumberUtils.findMinimum(inputArray));

        System.out.print("Array Elements (Index Based): ");
        NumberUtils.displayArrayUsingIndex(inputArray);

        System.out.print("Array Elements (Enhanced Loop): ");
        NumberUtils.displayArrayUsingEnhancedLoop(inputArray);

        int target = 23;
        int resultIndex = NumberUtils.performLinearSearch(inputArray, target);
        System.out.println("Index of " + target + ": " + resultIndex);

        // Loop operations
        System.out.println("\nRight-Angled Triangle Pattern:");
        PatternPrinter.displayRightAngledTriangle(4);

        System.out.println("\nMultiplication Table of 8:");
        PatternPrinter.printMultiplicationTable(8);

        System.out.println("\nFirst 5 Even Numbers:");
        PatternPrinter.printEvenSeries(5);

        System.out.println("\nFirst 5 Odd Numbers:");
        PatternPrinter.printOddSeries(5);
    }
}

