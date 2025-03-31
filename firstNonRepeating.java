import java.util.*;

public class firstNonRepeating {
    public static String firstNonRepeating(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            // Update frequency
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            
            // Add to queue if it's appearing for the first time
            if (freq.get(ch) == 1) {
                queue.offer(ch);
            }
            
            // Remove repeating characters from the queue
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }

            // Append first non-repeating character or '#'
            ans.append(queue.isEmpty() ? '#' : queue.peek());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(firstNonRepeating(s1)); // Output: "a#bb"

    }
}
