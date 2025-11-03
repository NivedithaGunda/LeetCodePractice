package LC2;


public class ListNode {

    ListNode next;
    int val;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }

    public ListNode createHead(int[] nums) {
        
        if (nums.length == 0) return null;

        ListNode head = new ListNode(nums[0]);

        ListNode curr = head;

        for (int i = 1; i <  nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }

        return head;
    }

    public void traverse(ListNode node) {
        if (node == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode curr = node;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    
}
