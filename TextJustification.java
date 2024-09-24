class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
         List<String> justifiedText = new ArrayList<>();
        int index = 0;
        int numOfWords = words.length;

        while (index < numOfWords) {
            List<String> currentLineWords = new ArrayList<>();
            int currentLineWidth = 0;

            // Try to fit as many words in the current line as possible
            while (index < numOfWords && currentLineWidth + words[index].length() + currentLineWords.size() <= maxWidth) {
                currentLineWords.add(words[index]);
                currentLineWidth += words[index].length();
                index++;
            }

            // Justify the current line
            StringBuilder justifiedLine = new StringBuilder();
            int totalSpaces = maxWidth - currentLineWidth;
            int numWords = currentLineWords.size();

            // If it's the last line or there's only one word, left-justify
            if (index >= numOfWords || numWords == 1) {
                for (int i = 0; i < numWords; i++) {
                    justifiedLine.append(currentLineWords.get(i));
                    if (i < numWords - 1) {
                        justifiedLine.append(" ");
                    }
                }
                while (justifiedLine.length() < maxWidth) {
                    justifiedLine.append(" ");
                }
            } else {
                // Distribute spaces evenly between words
                int spaceBetweenWords = totalSpaces / (numWords - 1);
                int extraSpaces = totalSpaces % (numWords - 1);

                for (int i = 0; i < numWords; i++) {
                    justifiedLine.append(currentLineWords.get(i));
                    if (i < numWords - 1) {
                        for (int j = 0; j < spaceBetweenWords; j++) {
                            justifiedLine.append(" ");
                        }
                        // Distribute extra spaces from the left
                        if (extraSpaces > 0) {
                            justifiedLine.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            justifiedText.add(justifiedLine.toString());
        }

        return justifiedText;

    }
}