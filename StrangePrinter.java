public class StrangePrinter {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Base case: single characters
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the DP table
        for (int len = 2; len <= n; len++) { // length of substring
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = dp[i][j - 1] + 1; // print s[j] separately

                // Check if we can merge with previous characters
                for (int k = i; k < j; k++) {
                    // Use charAt() to access characters
                    if (s.charAt(k) == s.charAt(j)) {
                        // Update dp[i][j] if we can merge
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + (k == j - 1 ? 0 : dp[k + 1][j - 1]));
                    }
                }
            }
        }

        return dp[0][n - 1];
    }

  }