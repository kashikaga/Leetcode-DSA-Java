class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
    int[] buckets = new int[n + 1];
    
    // Count the number of papers with each citation value
    for (int citation : citations) {
        if (citation >= n) {
            buckets[n]++;
        } else {
            buckets[citation]++;
        }
    }
    
    int count = 0;
    for (int i = n; i >= 0; i--) {
        count += buckets[i];
        if (count >= i) {
            return i;
        }
    }
    
    return 0;

    }
}