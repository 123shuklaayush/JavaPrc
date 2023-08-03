package Trees;
import java.util.*;
public class topViewOfBT {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    //Function to return a list of nodes visible from the top view
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new ArrayDeque<>();

        if(root == null)
            return ans;

        map.put(root.data, 0);
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Node curr = q.peek().node;
            int hd = q.peek().hd;
            q.remove();

            if(map.containsKey(hd)){
                map.put(curr.data, map.get(curr.data) +1);
            }
            else{
                map.put(curr.data, 1);
                ans.add(curr.data);
            }
            if(curr.left != null){
                q.add(new Pair(curr.left, hd-1));
            }
            if(curr.right != null){
                q.add(new Pair(curr.right, hd+1));
            }
        }
        return ans;
    }
}
