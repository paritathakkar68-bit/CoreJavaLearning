package lecture21;

public class ProgrammingLanguageSearch
{

    public static void main(String[] args)
    {
        String[] languages = {"Python", "C++", "JavaScript", "Java", "Ruby", "Go"};
        String target = "Java";
        boolean found = false;

        // Linear search using equals()
        for (String lang : languages)
        {
            if (lang.equals(target))
            {
                found = true;
                break;
            }
        }

        System.out.println("Searching for: " + target);
        if (found)
        {
            System.out.println("The string \"" + target + "\" exists in the array.");
        } else
        {
            System.out.println("The string \"" + target + "\" does NOT exist in the array.");
        }
    }
}
