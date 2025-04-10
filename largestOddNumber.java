//https://leetcode.com/problems/largest-odd-number-in-string/description/

class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int currNum = num.charAt(i) - '0';
            if ((currNum & 1) == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
