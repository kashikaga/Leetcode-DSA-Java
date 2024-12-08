class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = n + 1; // Initialize to a value greater than any possible length
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += nums[end]; // Expand the window by adding nums[end]

            // Shrink from the left as long as the condition is met
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1); // Update minimum length
                currentSum -= nums[start]; // Remove nums[start] from sum
                start++; // Move start forward
            }
        }

        return minLength == n + 1 ? 0 : minLength; // Return result
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); // Output: 2
        System.out.println(solution.minSubArrayLen(4, new int[]{1, 4, 4}));         // Output: 1
        System.out.println(solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})); // Output: 0
    }
 
    
}