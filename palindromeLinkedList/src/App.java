import java.util.List;
import java.util.ArrayList;

/*
public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) { this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next}
}
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static boolean isPalindrome(ListNode head) {
        
        //add each value to a list
        List<Integer> vals = new ArrayList<>();
        while(head != null){
            vals.add(head.val);
            head = head.next;
        }
        
        int l = 0;
        int r = vals.size() - 1 ;
        //two pointer comparison
        while(l<=r) {
            if (vals.get(l) != vals.get(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
