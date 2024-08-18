class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        
        int i2 = 0, i3 = 0, i5 = 0;
        
        for (int i = 1; i < n; i++) {
            int next2 = dp[i2] * 2;
            int next3 = dp[i3] * 3;
            int next5 = dp[i5] * 5;
            
            int nextNum = Math.min(next2, Math.min(next3, next5));
            dp[i] = nextNum;
            
            if (nextNum == next2) i2++;
            if (nextNum == next3) i3++;
            if (nextNum == next5) i5++;
        }
        
        return dp[n-1];
    }
}