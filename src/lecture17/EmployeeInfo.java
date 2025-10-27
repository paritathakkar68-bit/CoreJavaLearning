package lecture17;

public class EmployeeInfo {

    // Overloading by number of arguments
    void displayEmployee(String name, int id) {
        System.out.println("This is number of arguments");
    }

    // Overloading by type of arguments
    void displayEmployee(String name, double salary) {
        System.out.println("Type of arguments");
    }

    // Overloading by order of arguments
    void displayEmployee(double salary, String name) {
        System.out.println("Order of arguments");
    }

    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo();

        emp.displayEmployee("Parita", 100);
        emp.displayEmployee("Pari", 35000.00);
        emp.displayEmployee(60000.50, "Fairy");
    }
}

