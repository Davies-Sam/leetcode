

public class App {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val) {this.val = val;};
        ListNode(int val, ListNode next) {this.val = val; this.next = next;};
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        ListNode x = new ListNode(3);
        x.next = new ListNode(3);
        x.next.next = new ListNode(4);
        deleteDuplicates(x);
        while(x!= null) 
        {
            System.out.println(x.val);
            x=x.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode s = head;
        
        while(head != null)
        {
            ListNode checkNode = head.next;
            
            while(checkNode != null && checkNode.val == head.val)
            {
                checkNode = checkNode.next;
            }
            head.next = checkNode;
            head = checkNode;
        }
        return s;

    }
}
