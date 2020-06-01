package leetcode.junechallenge;

public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(1);
        left.right = new TreeNode(3);
        TreeNode right = new TreeNode(7);
        root.left = left;
        root.right = right;
        TreeNode.inOrder(root);
        System.out.println();
        root = invertTree(root);
        TreeNode.inOrder(root);

    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;
        return root;
    }
}
