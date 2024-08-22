public class Solution {
    public int findComplement(int num) {
        // Step 1: Create a mask with all bits set to 1 for the length of num
        int mask = ~0; // This creates a mask with all bits set to 1
        while ((mask & num) != 0) {
            mask <<= 1; // Shift left to create a mask of the same length as num
        }
        
        // Step 2: XOR num with the mask to get the complement
        return ~num & ~mask; // Flip bits of num and clear the bits where mask is 1
    

      }
}