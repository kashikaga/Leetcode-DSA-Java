public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0; // Start pointer
        int right = height.length - 1; // End pointer
        int maxArea = 0; // Variable to store the maximum area

        while (left < right) {
            // Calculate the width
            int width = right - left;
            // Calculate the height (minimum of the two lines)
            int currentHeight = Math.min(height[left], height[right]);
            // Calculate the area
            int currentArea = width * currentHeight;
            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer of the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea; // Return the maximum area found
    }
