class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels = 0;
        int vowelCount = 0;
        
        // Initialize the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }
        maxVowels = Math.max(maxVowels, vowelCount);
        
        // Slide the window
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                vowelCount--;
            }
            maxVowels = Math.max(maxVowels, vowelCount);
        }
        
        return maxVowels;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}