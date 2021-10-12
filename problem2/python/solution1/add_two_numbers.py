# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(l1, l2):
        res = ListNode()
        ptr = res
        carry = 0
        done = False
        while not done:
            num = 0
            if l2 is None and l1 is None:
                num = carry
            elif l1 is None:
                num = 0 + l2.val + carry
            elif l2 is None:
                num = l1.val + + carry
            else:
                num = l1.val + l2.val + carry

            carry = num // 10
            sum = num % 10

            ptr.val = sum

            if l1 is not None:
                l1 = l1.next
            if l2 is not None:
                l2 = l2.next

            if l1 is None and l2 is None and carry == 0:
                done = True

            if not done:
                ptr.next = ListNode()
                ptr = ptr.next
        return res

