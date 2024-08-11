class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        // Normalize k
        k = k % n;
        if (k == 0) return; // No rotation needed

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

    }
}
}