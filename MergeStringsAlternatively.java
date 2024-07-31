class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        if (length1 > minLength) {
            merged.append(word1.substring(minLength));
        } else if (length2 > minLength) {
            merged.append(word2.substring(minLength));
        }
        return merged.toString();
    } 
    }
