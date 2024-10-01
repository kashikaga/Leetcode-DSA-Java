class Solution {
    public int removeDuplicates(int[] nums) {
          if (nums.length == 0) return 0; // Handle empty array case

        int k = 1; // Initialize the count of unique elements
        int count = 1; // Count occurrences of the current number

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; // Increment count if the same number is found
            } else {
                count = 1; // Reset count for a new number
            }

            if (count <= 2) { // Allow at most two occurrences
                nums[k] = nums[i]; // Place the number in the next position
                k++; // Move to the next position
            }
        }

        return k; // Return the new length of the array

    }
}