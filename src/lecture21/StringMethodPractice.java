package lecture21;

public class StringMethodPractice {

    public static void main(String[] args) {

        // ====== Inherited from Object class ======
        String country1 = "India";
        String country2 = new String("India");

        // equals(Object obj)
        System.out.println("1. equals(): " + country1.equals(country2)); // true

        // toString()
        System.out.println("2. toString(): " + country1.toString()); // India

        // ====== String-specific methods ======
        String sentence = "  Welcome To Java World  ";

        // length()
        System.out.println("3. length(): " + sentence.length()); // 26

        // isEmpty()
        String blankString = "";
        System.out.println("4. isEmpty(): " + blankString.isEmpty()); // true

        // trim()
        System.out.println("5. trim(): '" + sentence.trim() + "'"); // "Welcome To Java World"

        // equals()
        System.out.println("6. equals(): " + sentence.equals("  Welcome To Java World  ")); // true

        // equalsIgnoreCase()
        System.out.println("7. equalsIgnoreCase(): " + "WORLD".equalsIgnoreCase("world")); // true

        // + operator
        String lang = "Core";
        String result1 = lang + "Java";
        System.out.println("8. + operator: " + result1); // CoreJava

        // concat()
        String result2 = lang.concat(" Concepts");
        System.out.println("9. concat(): " + result2); // Core Concepts

        // join()
        String technologies = String.join(", ", "Java", "Python", "C++");
        System.out.println("10. join(): " + technologies); // Java, Python, C++

        // replace()
        System.out.println("11. replace(): " + sentence.replace("o", "#")); // "  Welc#me T# Java W#rld  "

        // replaceFirst()
        System.out.println("12. replaceFirst(): " + sentence.replaceFirst("o", "#")); // "  Welc#me To Java World  "

        // replaceAll()
        System.out.println("13. replaceAll(): " + sentence.replaceAll("\\s", "")); // "WelcomeToJavaWorld"

        // indexOf()
        System.out.println("14. indexOf('o'): " + sentence.indexOf('o')); // 6

        // lastIndexOf()
        System.out.println("15. lastIndexOf('o'): " + sentence.lastIndexOf('o')); // 21

        // charAt()
        System.out.println("16. charAt(10): " + sentence.charAt(10)); // 'T'

        // contains()
        System.out.println("17. contains(\"Java\"): " + sentence.contains("Java")); // true

        // startsWith()
        System.out.println("18. startsWith(\"  Wel\"): " + sentence.startsWith("  Wel")); // true

        // endsWith()
        System.out.println("19. endsWith(\"ld  \"): " + sentence.endsWith("ld  ")); // true

        // toUpperCase()
        System.out.println("20. toUpperCase(): " + sentence.toUpperCase()); // "  WELCOME TO JAVA WORLD  "

        // toLowerCase()
        System.out.println("21. toLowerCase(): " + sentence.toLowerCase()); // "  welcome to java world  "

        // toCharArray()
        char[] characters = sentence.toCharArray();
        System.out.print("22. toCharArray(): ");
        for (char ch : characters) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // valueOf()
        boolean isLearning = true;
        String strLearning = String.valueOf(isLearning);
        System.out.println("23. valueOf(): " + strLearning); // true
    }
}

