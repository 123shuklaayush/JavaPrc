package Trees;
import java.util.*;
public class maxWidth {
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
    public static int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        int idx = 1;
        q.add(new Pair(root, idx));
        idx++;
        q.add(new Pair(null, 0));
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int start = idx;
            int end = 0;
            while(q.peek() != null){
                TreeNode p = q.remove().node;
                if(p.left != null) q.add(new Pair(p.left, idx++));
                else idx++;
                if(p.right != null) q.add(new Pair(p.right, idx++));
                else idx++;
            }
            end = idx;
            if(q.peek() == null && q.size()>1) {
                q.remove();
                q.add(new Pair(null, 0));
            }
            max = Math.max(max, (end-start+1));
        }
        return max;
    }

        static class Pair{
            TreeNode node;
            int indices;
            public Pair(TreeNode node, int indices){
                this.node = node;
                this.indices= indices;
            }
        }

    public static void main(String[] args) {
    }
}
