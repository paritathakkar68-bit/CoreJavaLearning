package lecture19;

public class MainApp
{
    public static void main(String[] args)
    {

        // Using Final Keyword
        University university = new University();
        university.showUniversityDetails();

        // Using Static Keyword
        Student s1 = new Student("Parita");
        Student s2 = new Student("Fairy");

        s1.showStudentInfo();
        s2.showStudentInfo();

        // Calling static method
        Student.showTotalStudents();

        // Using Final Class
        UniversityRules rules = new UniversityRules();
        rules.printRules();
    }
}

