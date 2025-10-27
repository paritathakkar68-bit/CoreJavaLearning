package lecture26;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentListDemo {
    public static void main(String[] args) {
        // Creating ArrayList of type String to store student names
        ArrayList<String> studentList = new ArrayList<>();

        // Adding student names to the list
        studentList.add("Parita");
        studentList.add("Pari");
        studentList.add("Hetal");
        studentList.add("Riddhi");
        studentList.add("Hasti");

        // Printing initial list
        System.out.println("Initial List: " + studentList);

        // Adding a student at specific index
        studentList.add(2, "Divya");
        System.out.println("After adding Divya at index 2: " + studentList);

        // Removing a student from specific index
        studentList.remove(4);
        System.out.println("After removing student at index 4: " + studentList);

        // Accessing a student by index
        System.out.println("Student at index 3: " + studentList.get(3));

        // Replacing a student name at index 1
        studentList.set(1, "Neha");
        System.out.println("After replacing index 1 with Neha: " + studentList);

        // Printing list using for loop
        System.out.println("\nPrinting using for loop:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        // Printing list using enhanced for-each loop
        System.out.println("\nPrinting using enhanced for-each loop:");
        for (String student : studentList) {
            System.out.println(student);
        }

        // Printing list using iterator
        System.out.println("\nPrinting using Iterator:");
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

