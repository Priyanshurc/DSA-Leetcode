import java.util.Scanner;

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
	public static void main(String[] args) {
        Solution solution = new Solution();
		int n;
		Scanner inp = new Scanner (System.in);
		n = inp.nextInt();
		if (n <= 0) {
            System.out.println("The linked list does not have a cycle.");
            return;
        }
		
        
		ListNode head = new ListNode(inp.nextInt());
        ListNode current = head;
		
		for (int i = 1; i < n; i++) {
            current.next = new ListNode(inp.nextInt());
            current = current.next;
        }

		String createCycle = inp.next();
        if (createCycle.equalsIgnoreCase("yes")) {
            System.out.println("Enter the position (0-based index) where the last node should link to:");
            int pos = inp.nextInt();
            if (pos >= 0 && pos < n) {
                ListNode cycleNode = head;
                for (int i = 0; i < pos; i++) {
                    cycleNode = cycleNode.next;
                }
                current.next = cycleNode;
            }
        }
        boolean result = solution.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
	}
}