class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0;
        
        // Move all non-zero elements to their correct positions
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        
        // Fill the remaining elements with zeros
        while (nonZeroIndex < n) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}