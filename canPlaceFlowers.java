class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int count = 0; // To count how many flowers we can plant
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and the adjacent plots are also empty or out of bounds
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == length - 1 || flowerbed[i + 1] == 0)) {
                
                // Plant a flower
                flowerbed[i] = 1;
                count++; // Increment the count of planted flowers

                // If we've already planted enough flowers, return true
                if (count >= n) {
                    return true;
                }
            }
        }

        // After checking all plots, return whether we could plant n flowers
        return count >= n;

    }
}