class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitudes = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
        }
        
        int maxAltitude = 0;
        for (int altitude : altitudes) {
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        
        return maxAltitude;
    }
}