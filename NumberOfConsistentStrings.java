class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         // Array to keep track of allowed characters
        boolean[] isAllowed = new boolean[26];

        // Populate the isAllowed array with characters from the 'allowed' string
        for (char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }

        // Initialize count for consistent strings
        int count = 0;

        // Iterate through each word in the array 'words'
        for (String word : words) {
            // If the word is consistent, increment the count
            if (isConsistent(word, isAllowed)) {
                count++;
            }
        }

        // Return the total count of consistent strings
        return count;
    }

    // Helper method to check if a word is consistent
    private boolean isConsistent(String word, boolean[] isAllowed) {
        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            // If the character is not in the allowed list, return false
            if (!isAllowed[word.charAt(i) - 'a']) {
                return false;
            }
        }
        // Return true if all characters of the word are allowed
        return true;
    

    }
}