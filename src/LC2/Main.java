package LC2;
public class Main {

    public static void main(String[] args) {
        LC2 lc2 = new LC2();
        ListNode node = new ListNode();
        ListNode l1 = node.createHead(new int[]{1,2,3});
        ListNode l2 = node.createHead(new int[]{5,6,4});
        ListNode result = lc2.addTwoNumbers(l1, l2);
        node.traverse(result);
    }
    
}
