class Solution {
    public int smallestDistancePair(int[] nums, int k) {
         Arrays.sort(nums); // Step 1: Sort the array
        int n = nums.length;

        // Step 2: Set the binary search bounds
        int left = 0; // Minimum possible distance
        int right = nums[n - 1] - nums[0]; // Maximum possible distance

        // Step 3: Binary search for the kth smallest distance
        while (left < right) {
            int mid = left + (right - left) / 2; // Midpoint distance
            if (countPairs(nums, mid) < k) {
                left = mid + 1; // Look for larger distances
            } else {
                right = mid; // Look for smaller distances
            }
        }

        return left; // The kth smallest distance
    }

    // Helper function to count pairs with distance <= mid
    private int countPairs(int[] nums, int mid) {
        int count = 0;
        int left = 0;

        // Two-pointer technique
        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > mid) {
                left++; // Move left pointer to maintain the distance condition
            }
            count += right - left; // Count pairs (left, right)
        }

        return count;
    

    }
}