public class PangramChecker {
    public static Boolean isPangram(String input) {
        if (input == null) {
            return false;
        }
        
        // Convert the input to lowercase for case-insensitive matching
        input = input.toLowerCase();
        
        // Create a set to store the unique alphabet letters found in the input
        Set<String> alphabetSet = new Set<String>();
        
        for (Integer i = 0; i < input.length(); i++) {
            String character = input.substring(i, i + 1);
            if (character >= 'a' && character <= 'z') {
                alphabetSet.add(character);
            }
        }
        
        // Check if the set contains all alphabet letters
        return alphabetSet.size() == 26; // There are 26 letters in the English alphabet.
    }
}
