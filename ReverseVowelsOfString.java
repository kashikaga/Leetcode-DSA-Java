class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            
            if (vowels.contains(charArray[left])) {
                
                if (vowels.contains(charArray[right])) {

                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        
        return new String(charArray);
    }

    }

        