package lecture17;

public class PolymorphismExample {

    // Overloading based on number of arguments
    void bookDetails(int id, int pages) {
        System.out.println("This is number of arguments");
    }

    // Overloading based on type of arguments
    void bookDetails(String title, int pages) {
        System.out.println("Type of arguments");
    }

    // Overloading based on order of arguments
    void bookDetails(int pages, String title, int id) {
        System.out.println("Order of arguments");
    }

    public static void main(String[] args) {
        PolymorphismExample obj = new PolymorphismExample();

        // Number of arguments
        obj.bookDetails(101, 300);

        // Type of arguments
        obj.bookDetails("Java", 100);

        // Order of arguments
        obj.bookDetails(500, "Advanced C++", 200);
    }
}

