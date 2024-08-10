public class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to avoid overflow issues during conversion
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int quotient = 0;

        // Perform the division using bit manipulation
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;
            // Double the divisor until it exceeds the dividend
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            // Subtract the largest multiple of divisor found
            absDividend -= temp;
            quotient += multiple;
        }

        // Apply the sign to the quotient
        return negative ? -quotient : quotient;
    

   