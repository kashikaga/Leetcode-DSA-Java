class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        
        long[] dp = new long[n];
        
        // Initialize dp with the first row of points
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }
        
        // Iterate over each row starting from the second row
        for (int i = 1; i < m; i++) {
            long[] newDp = new long[n];
            
            // Calculate the maximum points from the left and right
            long leftMax = Long.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                leftMax = Math.max(leftMax, dp[j] + j);
                newDp[j] = Math.max(newDp[j], points[i][j] + leftMax - j);
            }
            
            long rightMax = Long.MIN_VALUE;
            for (int j = n - 1; j >= 0; j--) {
                rightMax = Math.max(rightMax, dp[j] - j);
                newDp[j] = Math.max(newDp[j], points[i][j] + rightMax + j);
            }
            
            dp = newDp; // Move to the next row
        }
        
        // Return the maximum points that can be collected
        long maxPoints = Long.MIN_VALUE;
        for (long point : dp) {
            maxPoints = Math.max(maxPoints, point);
        }
        
        return maxPoints;
    }
}