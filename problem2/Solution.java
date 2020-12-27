class Solution {
	public static void main(String[] args) {

	}

	// We want to code a full adder using 2 numbers
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode res = new ListNode();
        ListNode ptr = res; // pointer to the first node
    	int carry = 0; // initialize carry at 0

    	while (l1 != null && l2 != null) {
            int num = l1.val + l2.val + carry;
            carry = num / 10;
            int sum = num % 10;
            
            ptr.val = sum;
            System.out.println(ptr.val);
            if (l1.next != null && l2.next != null) ptr.next = new ListNode();
            ptr = ptr.next;
            
            l1 = l1.next;
            l2 = l2.next;
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
