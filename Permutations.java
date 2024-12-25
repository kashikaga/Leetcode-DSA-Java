import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // If the temporary list is the same length as the original array, we found a permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // Skip already used numbers
                if (tempList.contains(nums[i])) continue;
                // Add the number to the current permutation
                tempList.add(nums[i]);
                // Recurse with the updated list
                backtrack(result, tempList, nums);
                // Backtrack, remove the last number added
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[] nums1 = {1, 2, 3};
        System.out.println(solution.permute(nums1));
        
        int[] nums2 = {0, 1};
        System.out.println(solution.permute(nums2));
        
        int[] nums3 = {1};
        System.out.println(solution.permute(nums3));
    }
}
