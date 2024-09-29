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
    public ListNode oddEvenList(ListNode head) {
         // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers for odd and even nodes
        ListNode odd = head;                   // Pointer for odd indexed nodes
        ListNode even = head.next;             // Pointer for even indexed nodes
        ListNode evenHead = even;              // Keep track of the start of the even list

        // Loop until we reach the end of the list
        while (even != null && even.next != null) {
            odd.next = even.next;              // Link current odd node to the next odd node
            odd = odd.next;                    // Move to the next odd node
            even.next = odd.next;              // Link current even node to the next even node
            even = even.next;                  // Move to the next even node
        }

        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;

        return head;
    }
}