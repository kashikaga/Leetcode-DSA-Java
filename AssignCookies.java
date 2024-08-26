class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors and cookie sizes in ascending order
        Arrays.sort(g);
        Arrays.sort(s);
        
        int contentChildren = 0;
        int i = 0, j = 0;
        
        // Iterate through the children and cookies
        while (i < g.length && j < s.length) {
            // If the current cookie size is greater than or equal to the current child's greed factor,
            // increment the content children count and move to the next child and cookie
            if (s[j] >= g[i]) {
                contentChildren++;
                i++;
            }
            j++;
        }
        
        return contentChildren;
    }
}