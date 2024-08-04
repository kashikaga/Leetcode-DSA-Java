class Solution {
    public int maxProfit(int[] prices) {
         int totalProfit = 0;

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If the current day's price is greater than the previous day's price
            if (prices[i] > prices[i - 1]) {
                // Add the difference to total profit
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit; 
    }
}