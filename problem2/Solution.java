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
    	// New node to store the resulting linked list of nodes
        ListNode res = new ListNode();

        // Pointer to the first node. While iterating through l1 and l2,
        // we will also iterate through the resulting linked list as we
        // add nodes to it.
        // This solution can be improved by also using pointers for l1 and l2.
        ListNode ptr = res;

        // We are basically coding a decimal full-adder. We initialize the carry at 0
    	int carry = 0;
        
        // Boolean flag which will allow us to exit the loop
        boolean done = false;

        // While we are not done, we continue the loop
    	while (!done) {

    		// This is where we store the result of the addition of the current node values
    		// in l1 and l2
            int num = 0;
            
            // We could have done this better by using ternary expressions or storing
            // l1.val and l2.val (whether 0 or null) inside of temporary variables.
            // we could have also handled the final carry AFTER the loop finished by
            // creating a new final node and attaching it to the resulting linked list
            // at the end.

            // If l1 and l2 are null, we are at the end of our two sequences l1 and l2
            // and we loop one last time to add the final carry as a new node to the resulting
            // linked list
            if (l2 == null && l1 == null) num = carry;

            // We simply add l1.val and l2.val and the carry (carry starts at 0 as initialized
            // prior to the loop)
            else if (l1 == null) num = 0 + l2.val + carry;
            else if (l2 == null) num = l1.val + 0 + carry;
            else num = l1.val + l2.val + carry;
            
            // Extract the carry, which will always be 1 if the resulting addition of the current
            // Node values of l1 and l2 is >= 10
            carry = num / 10;

            // Extract the sum to insert in our resulting linkedlist as it is being built,
            // this will be a digit between 0 and 9
            int sum = num % 10;
            
            // Insert the sum in the current node
            ptr.val = sum;
               
            // If we can move on to the next node in either l1 or l2, we do so.
            // If not, we have reached the end of l1 or l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            // This checks if we are finished. We are finished if we reach the end
            // of l1 and l2, AND if there is no more carry to add
            if (l1 == null && l2 == null && carry == 0) done = true;
            
            // If we are not yet finished, we add a new node at the end of the resulting
            // linked list and we iterate to it
            if (!done) {
                ptr.next = new ListNode();
                ptr = ptr.next;
            }
        
        }

        // We return the resulting linkedlist
        return res;
            
    }
}