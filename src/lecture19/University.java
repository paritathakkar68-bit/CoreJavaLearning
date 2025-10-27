package lecture19;

class University
{
    // FINAL VARIABLE - constant value
    public final String UNIVERSITY_NAME = "National Tech University";

    // FINAL METHOD - cannot be overridden
    public final void showUniversityDetails()
    {
        System.out.println("Welcome to " + UNIVERSITY_NAME);
    }
}

