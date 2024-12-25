class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          // Create a map to group the anagrams, where the key is the sorted string.
        Map<String, List<String>> anagramsMap = new HashMap<>();

        // Iterate over each string in the array.
        for (String str : strs) {
            // Convert the string to a character array and sort it.
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            // Create a new string from the sorted character array.
            String sortedStr = new String(charArray);

            // If the sorted string key is not present in the map, initialize it with an empty list.
            anagramsMap.putIfAbsent(sortedStr, new ArrayList<>());
            
            // Add the original string to the list associated with the sorted string key.
            anagramsMap.get(sortedStr).add(str);
        }

        // Return the values of the map as a list of lists.
        return new ArrayList<>(anagramsMap.values());

    }
}