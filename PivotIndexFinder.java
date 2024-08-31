public class PivotIndexFinder {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Calculate right sum
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Return the pivot index
            }

            // Update the left sum for the next iteration
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    

        }
}