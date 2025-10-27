//3. Linear Search Without Function – Using char Array

package lecture11;

public class CharacterSearch {

    public static void main(String[] args) {
        char[] letters = {'X', 'Y', 'Z', 'A', 'B'};
        char searchLetter = 'A';
        int indexFound = -1;

        // Looping through array
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == searchLetter) {
                indexFound = i;
                break;  // Exit loop once found
            }
        }

        System.out.println("Character found at index: " + indexFound);
    }
}

