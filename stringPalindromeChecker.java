public class PalindromeChecker {
    public boolean isPalindrome(String s) {
       class Solution {
    public boolean isPalindrome(String s) {
         // Normalize the string: convert to lowercase and filter out non-alphanumeric characters
        StringBuilder normalized = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }
        
        // Check if the normalized string is a palindrome
        String filteredString = normalized.toString();
        int left = 0;
        int right = filteredString.length() - 1;
        
        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // It is a palindrome
    

    }
}

  