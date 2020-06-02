package leetcode.junechallenge;

public class DeleteNode {

    public static void main(String args[]){
        ListNode node = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode.print(node);

        deleteNode(node1);

        ListNode.print(node);



    }

    public static void deleteNode(ListNode node) {
        ListNode prevNode = null;
        while(node.next != null){
            node.val = node.next.val;
            prevNode = node;
            node = node.next;
        }
        prevNode.next = null;
    }
}
