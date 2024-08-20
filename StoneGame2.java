class Solution {
    public int stoneGameII(int[] piles) {
         int n = piles.length;
        int[][] dp = new int[n][n + 1];
        int[] suffixSum = new int[n];
        
        // Suffix sum to easily calculate the sum of piles from any index to the end
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        
        // DP calculation: dp[i][m] means the maximum number of stones Alice can get 
        // starting from index i with the current M value being m
        for (int i = n - 1; i >= 0; i--) {
            for (int m = 1; m <= n; m++) {
                if (i + 2 * m >= n) {
                    dp[i][m] = suffixSum[i];
                } else {
                    for (int x = 1; x <= 2 * m; x++) {
                        dp[i][m] = Math.max(dp[i][m], suffixSum[i] - dp[i + x][Math.max(m, x)]);
                    }
                }
            }
        }
        
        return dp[0][1];

    }
}