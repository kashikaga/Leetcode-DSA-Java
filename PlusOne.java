public class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and work backwards
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set current digit to 0 and continue to the next more significant digit
            digits[i] = 0;
        }
        
        // If we exit the loop, it means we had a carry out of the most significant digit
        // We need to create a new array with an additional space for the carry
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // The first digit will be 1 followed by all zeros
        return newNumber;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 2, 4]

        // Example 2
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [4, 3, 2, 2]

        // Example 3
        int[] digits3 = {9};
        int[] result3 = solution.plusOne(digits3);
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1, 0]
    }
}
