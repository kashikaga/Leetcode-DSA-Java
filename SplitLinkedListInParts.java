/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
          // Step 1: Calculate the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Calculate the size of each part
        int partSize = length / k;
        int extraNodes = length % k;

        // Step 3: Create the result array
        ListNode[] parts = new ListNode[k];
        current = head;

        for (int i = 0; i < k; i++) {
            ListNode partHead = current;
            int currentPartSize = partSize + (i < extraNodes ? 1 : 0); // Distribute extra nodes
            
            // Step 4: Move the current pointer to the end of the current part
            for (int j = 0; j < currentPartSize - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }
            
            // Step 5: Disconnect the current part from the rest of the list
            if (current != null) {
                ListNode nextPartHead = current.next;
                current.next = null; // Disconnect the current part
                current = nextPartHead; // Move to the next part
            }
            
            // Step 6: Assign the head of the current part to the result array
            parts[i] = partHead;
        }

        return parts;

    }
}