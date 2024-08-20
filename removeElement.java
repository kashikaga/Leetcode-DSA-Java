public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Initialize a counter for elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place it at the k-th position and increment k
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Return the count of elements not equal to val
        return k;
    }

   
    
}