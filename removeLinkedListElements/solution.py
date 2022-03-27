from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
       
        if head is None:
            return None

        while(head != None):
            if (head.val == val):
                head = head.next
            else:
                break
        root = head
        
        while(head):
            head.next = self.helper(head, val)
            head = head.next
            
        return root
                
    def helper(self, head, val):
        """returns the next valid node"""
        
        while(head):
            if (head.next):
                if (head.next.val == val):
                    head = head.next
                else:
                    return head.next
            else:
                return None

    def printLL(self, head):
        while(head):
            print(head.val)
            head = head.next


if __name__ == "__main__":
    s = Solution()

    head = ListNode(1, ListNode(2, ListNode(6, ListNode(3, ListNode(4, ListNode(5, ListNode(6, None)))))))
    
    print("Original Linked List:")
    s.printLL(head)

    val =  6
    s.removeElements(head, val)

    print(f"After removeElements(head, {val})")
    s.printLL(head)

