class Solution {
    public int mySqrt(int x) {
         if (x < 2) {
            return x; // Handle 0 and 1 directly
        }

        int left = 1, right = x / 2; // Start with 1 and x/2 for optimization
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow
            long midSquared = (long) mid * mid; // Use long to prevent overflow

            if (midSquared == x) {
                return mid; // Found exact square root
            } else if (midSquared < x) {
                result = mid; // Update result to mid
                left = mid + 1; // Move left pointer up
            } else {
                right = mid - 1; // Move right pointer down
            }
        }

        return result;
    }
}