class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        // Edge case: if s is empty, it's always a subsequence
        if (sLength == 0) {
            return true;
        }
        
        int sIndex = 0; // Pointer for string s
        
        // Iterate through string t
        for (int tIndex = 0; tIndex < tLength; tIndex++) {
            // If characters match, move the pointer for s
            if (sIndex < sLength && s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            // If we've matched all characters of s, return true
            if (sIndex == sLength) {
                return true;
            }
        }
        
        // If we finish iterating through t and haven't matched all of s
        return false;
    }
}