package CodeTemplates;

public class LinkedList_FastAndSlowPointer {
    // Linked list : fast and slow pointer
    public int fn(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int ans = 0;
    
        while (fast != null && fast.next != null) {
            // do logic
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return ans;
    }
}
