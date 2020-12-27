class Solution {
	public static void main(String[] args) {

	}

	// We want to code a full adder using 2 numbers
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode res = new ListNode();
    	int carry = 0; // initialize carry at 0

    	int ctr = 0; // counter to track whether we are at the first iteration

        while (l1 != null && l2 != null) {
            int num = 0;
        	if (l2 == null) {
        		num = l1.val + 0 + carry;
        	} else if (l1 == null) {
        		num = l2.val + 0 + carry;
        	} else {
        		num = l1.val + l2.val + carry;
        	}

        	carry = num / 10; // integer division to extract the 1
        	int sum = num % 10; // modulo to extract the remainder (digit after the 1)

        	if (ctr == 0) res.val = sum; // new node on the first iteration
        	else {
        		res.next = new ListNode(sum);
        		res = res.next;
        	}

        	if (l1.next != null) l1 = l1.next;
        	if (l2.next != null) l2 = l2.next;
        	ctr++;
        }
       return res;
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
