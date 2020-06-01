package leetcode.junechallenge;

public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


        public static void inOrder(TreeNode root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.val + " -> ");
            inOrder(root.right);

        }
}
