class Solution {
    public double findMaxAverage(int[] nums, int k) {
          // Calculate the sum of the first 'k' elements
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;

        // Slide the window over the array
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Add the next element and remove the first element of the previous window
            maxSum = Math.max(maxSum, sum); // Update maxSum if the new sum is greater
        }

        // Return the maximum average
        return maxSum / k;
    }
}