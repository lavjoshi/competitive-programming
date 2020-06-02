package leetcode.junechallenge;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public ListNode() {
    }


    public static void print(ListNode node){
        System.out.println();
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }
}
