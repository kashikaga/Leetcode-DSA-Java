class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0; // No jumps needed if the array has 1 or fewer elements
        
        int jumps = 0;        // Number of jumps made
        int currentEnd = 0;  // The farthest point that can be reached with the current number of jumps
        int farthest = 0;     // The farthest point that can be reached with the next jump
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest point that can be reached from the current index
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we have come to the end of the range for the current jump
            if (i == currentEnd) {
                jumps++;          // We need to make another jump
                currentEnd = farthest; // Update the end to the farthest point we can reach
            }
        }
        
        return jumps;
    }
}