class Solution {
    public int compress(char[] chars) {
         int writeIndex = 0;  // Index to write compressed characters
        int readIndex = 0;   // Index to read characters from the input array

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            // Count the number of occurrences of the current character
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            // Write the current character to the output
            chars[writeIndex++] = currentChar;

            // If count is greater than 1, write the count as well
            if (count > 1) {
                // Convert count to characters and write them to the array
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[writeIndex++] = digit;
                }
            }
        }

        // Return the new length of the compressed array
        return writeIndex;

    }
}