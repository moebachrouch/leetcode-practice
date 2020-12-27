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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode ptr = res; // pointer to the first node
    	int carry = 0; // initialize carry at 0
        
        boolean done = false;

    	while (!done) {
            int num = 0;
            
            if (l2 == null && l1 == null) num = carry;
            else if (l1 == null) num = 0 + l2.val + carry;
            else if (l2 == null) num = l1.val + 0 + carry;
            else num = l1.val + l2.val + carry;
            
            carry = num / 10;
            int sum = num % 10;
            
            ptr.val = sum;
                
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 == null && l2 == null && carry == 0) done = true;
                        
            if (!done) {
                ptr.next = new ListNode();
                ptr = ptr.next;
            }
        
        }
        return res;
            
    }
}