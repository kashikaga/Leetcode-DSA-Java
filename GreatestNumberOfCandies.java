class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         // Find the maximum number of candies any kid currently has
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        // Create a list to store the result
        List<Boolean> result = new ArrayList<>();
        
        // Check each kid if they can have the greatest number of candies
        for (int candy : candies) {
            result.add((candy + extraCandies) >= maxCandies);
        }
        
        return result;

    }
}