class Solution {
    public int minSteps(int n) {
         if (n == 1) return 0; // If we need only one 'A', no operations are needed.

        int[] dp = new int[n + 1]; // Array to store minimum operations for each count of 'A'

        // Fill the dp array
        for (int i = 2; i <= n; i++) {
            dp[i] = i; // Maximum operations would be pasting 'A' i-1 times after the first copy
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) { // j is a divisor of i
                    dp[i] = Math.min(dp[i], dp[j] + (i / j)); // Copy and paste operations
                }
            }
        }

        return dp[n]; // Return the minimum operations to get n 'A's

    }
}