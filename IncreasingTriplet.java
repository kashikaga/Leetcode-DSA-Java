class Solution {
    public boolean increasingTriplet(int[] nums) {
          // Initialize first and second to maximum possible values
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                // Update first if num is smaller or equal to first
                first = num;
            } else if (num <= second) {
                // Update second if num is smaller or equal to second
                second = num;
            } else {
                // If we find a number greater than both first and second
                return true; // Found a valid triplet
            }
        }

        return false; 
    }
}