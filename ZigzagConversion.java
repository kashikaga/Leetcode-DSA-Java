public class ZigzagConversion {
    public String convert(String s, int numRows) {
        // Edge case: if numRows is 1 or greater than or equal to the length of the string
        if (numRows <= 1 || numRows >= s.length()) {
            return s;
        }

        // Create an array of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            // Append the character to the current row
            rows[currentRow].append(c);

            // Change direction if we hit the top or bottom row
            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            // Move to the next row
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

  }