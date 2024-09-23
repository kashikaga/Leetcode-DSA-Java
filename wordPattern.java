class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false; // Length mismatch
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            // Check if the character is already mapped to a word
            if (charToWord.containsKey(currentChar)) {
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false; // Mismatch in mapping
                }
            } else {
                charToWord.put(currentChar, currentWord);
            }

            // Check if the word is already mapped to a character
            if (wordToChar.containsKey(currentWord)) {
                if (!wordToChar.get(currentWord).equals(currentChar)) {
                    return false; // Mismatch in mapping
                }
            } else {
                wordToChar.put(currentWord, currentChar);
            }
        }

        return true; 
    }
}