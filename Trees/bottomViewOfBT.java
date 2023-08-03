package Trees;
import java.util.*;

public class bottomViewOfBT {

    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<Pair> q = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair temp= q.remove();
            int hd = temp.hd;
            Node curr = temp.node;
            if(map.containsKey(hd)){
                map.put(curr.data, hd);
            }
            else{
                map.put(curr.data, 1);
            }
            if(curr.left != null) q.add(new Pair(curr.left, hd-1));
            if(curr.right != null) q.add(new Pair(curr.right, hd+1));
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
}
