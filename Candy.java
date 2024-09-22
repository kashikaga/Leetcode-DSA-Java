class Solution {
    public int candy(int[] ratings) {
         int n = ratings.length;
        int[] candies = new int[n];
        
        // Initialize all children with 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
        
        // Traverse from left to right, ensuring higher rating children get more candies than their left neighbor
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1;
            }
        }
        
        // Traverse from right to left, ensuring higher rating children get more candies than their right neighbor
        for (int i = n-2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]) {
                candies[i] = candies[i+1] + 1;
            }
        }
        
        // Calculate the total number of candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        
        return totalCandies;

    }
}