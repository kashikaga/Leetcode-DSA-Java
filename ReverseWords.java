public class ReverseWords {
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces and split the string by spaces
        String[] words = s.trim().split("\\s+");
        
        // StringBuilder to construct the result
        StringBuilder reversed = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();
    }

  }