package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class intro {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static class binaryTree{
        static int idx = -1;
        public static Node buildTree(int [] nodes){
            idx++;
            if(nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    static int sum = 0;
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return targetSum == sum;
        sum += root.data;
        if(sum == targetSum) return true;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1 ,3, -1, 6, -1, -1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println(hasPathSum(root, 22));
    }
}
