class ListNode {
    int value; 
    ListNode next; 
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}