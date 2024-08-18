class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // The potential GCD string is the substring of str1 from 0 to gcdLength
        String candidate = str1.substring(0, gcdLength);

        // Check if this candidate can form both str1 and str2
        if (canForm(str1, candidate) && canForm(str2, candidate)) {
            return candidate;
        }

        return ""; // If no valid string found
    }

    // Helper function to check if a string can be formed by repeating another string
    private boolean canForm(String s, String t) {
        return s.length() % t.length() == 0 && (t.repeat(s.length() / t.length()).equals(s));
    }

    // Helper function to compute GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}