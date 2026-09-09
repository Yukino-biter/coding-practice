import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode  head2 = revers(slow);
        while (head2!=null){
            if(head.val!=head2.val){
                return false;
            }
            head2 = head2.next;
            head = head.next;
        }
        return true;
    }
    public static ListNode revers(ListNode head){
        ListNode pre  = null;
        ListNode cur  = head;
        while (cur!=null){
            ListNode nxt = null;
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
    public static void main(String[] args) {

    }

}
