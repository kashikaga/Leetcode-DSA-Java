class Solution {
    public int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // If there's no space, the entire string is a single word
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        
        // The length of the last word is the difference between the total length
        // and the index of the last space
        return s.length() - lastSpaceIndex - 1;
    }
}