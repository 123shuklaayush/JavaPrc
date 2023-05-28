package Trees;
import java.util.*;


public class gfgTree {
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> leftView(Node root)
    {
        if(root.left == null) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(root.data);
            return a;
        }

        ArrayList<Integer> arr = leftView(root.left);
        return arr;

    }
}
