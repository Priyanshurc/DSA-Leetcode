import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode();
        // Use a pointer to track the current node in the merged list
        ListNode current = dummy;
        
        // While both lists are non-empty, compare their current nodes and attach the smaller one
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // If one of the lists is empty, attach the remaining elements of the other list
		/* Can be written like this also:
		
        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }
		*/
		
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // The merged list starts at dummy.next
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Input for the first linked list
        System.out.println("Enter the elements of the first linked list separated by spaces:");
        ListNode list1 = createLinkedListFromInput(inp.nextLine());

        // Input for the second linked list
        System.out.println("Enter the elements of the second linked list separated by spaces:");
        ListNode list2 = createLinkedListFromInput(inp.nextLine());

        // Merge the two lists
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged linked list
        System.out.println("Merged Linked List:");
        printLinkedList(mergedList);
    }

    // Helper method to create a linked list from a space-separated string of numbers
    private static ListNode createLinkedListFromInput(String input) {
        String[] values = input.split("\\s+");
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
