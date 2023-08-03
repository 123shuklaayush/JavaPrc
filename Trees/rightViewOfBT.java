package Trees;
import java.util.*;

public class rightViewOfBT {
    public class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
        //Function to return list containing elements of right view of binary tree.
        ArrayList<Integer> rightView(Node root) {
            ArrayList<Integer> arr = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<Pair> q = new ArrayDeque<>();
            q.add(new Pair(root, 0));
            while(!q.isEmpty()){
                Pair node = q.remove();
                int level = node.level;
                Node curr = node.node;
                if(!map.containsKey(level)){
                    map.put(level, curr.data);
                }
                if(curr.right != null) q.add(new Pair(curr.right, level+1));
                if(curr.left != null) q.add(new Pair(curr.left, level+1));
            }
            for(Map.Entry<Integer, Integer> e: map.entrySet()){
                arr.add(e.getValue());
            }
            return arr;
        }
}
