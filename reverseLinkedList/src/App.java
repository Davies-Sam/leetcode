public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {        
            ListNode nextNode = curr.next; 
            curr.next = prev;
            prev = curr;
            curr = nextNode;
         
        }
    return prev;
    }
}
