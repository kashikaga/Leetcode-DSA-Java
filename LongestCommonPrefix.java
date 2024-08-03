public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
       class Solution {
    public String longestCommonPrefix(String[] strs) {
       // Check for an empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix is reduced to an empty string, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
     
    }
}