public class Solution {
    public int strStr(String haystack, String needle) {
        // Check for edge cases
        if (needle.length() == 0) {
            return 0; // If needle is empty, return 0
        }
        if (haystack.length() < needle.length()) {
            return -1; // If haystack is shorter than needle, return -1
        }

        // Loop through the haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the starting index of the first occurrence
            }
        }

        return -1; // If no match is found, return -1
    

  