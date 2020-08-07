package leetcode.aug;

import leetcode.junechallenge.TreeNode;

import java.util.*;

/*
Given a binary tree, return the vertical order traversal of its nodes values.

For each node at position (X, Y), its left and right children respectively will be at positions (X-1, Y-1) and (X+1, Y-1).

Running a vertical line from X = -infinity to X = +infinity, whenever the vertical line touches some nodes, we report the values of the nodes in order from top to bottom (decreasing Y coordinates).

If two nodes have the same position, then the value of the node that is reported first is the value that is smaller.

Return an list of non-empty reports in order of X coordinate.  Every report will have a list of values of nodes.
 */
class Point{
    int x;
    int y;
    int val;
    public Point(){

    }
    public Point(int x, int y, int val){
        this.x=x;
        this.y=y;
        this.val=val;
    }
}
public class VerticalOrder {

    private static  Map<Integer, PriorityQueue<Point>> map = new TreeMap<>();
    private static Comparator<Point> pointComparator = new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            if(o2.y == o1.y){
                return o1.val - o2.val;
            }else{
                return o1.y-o2.y;
            }
        }
    };
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null){
            return null;
        }
        List<List<Integer>> res= new ArrayList();

        check(root,0,0);
        for(Map.Entry<Integer,PriorityQueue<Point>> entry : map.entrySet()){
            PriorityQueue<Point> queue = entry.getValue();
            List<Integer> list = new ArrayList<>();
            while(!queue.isEmpty()){
                list.add(queue.poll().val);
            }
            res.add(list);

        }
        return res;


    }

    public static void check(TreeNode root,int x,int y){
        if(root == null){
            return;
        }
        map.putIfAbsent(x,new PriorityQueue<>(pointComparator));
        map.get(x).add(new Point(x,y,root.val));
        check(root.left,x-1,y+1);
        check(root.right,x+1,y+1);

    }

    public static void main(String a[]){
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(8);
        TreeNode right = new TreeNode(1);

        right.left = new TreeNode(3);
        right.left.right = new TreeNode(4);
        right.left.right.right = new TreeNode(7);


        right.right = new TreeNode(2);
        right.right.left = new TreeNode(5);
        right.right.left.left = new TreeNode(6);


        root.left = left;
        root.right = right;
        List<List<Integer>> res = verticalTraversal(root);
    }
}
