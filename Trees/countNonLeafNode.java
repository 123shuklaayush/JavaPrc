package Trees;

class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class countNonLeafNode {
    static int countNonLeafNodes(Node root) {
        //code here
        int count = 0;
        if(root == null){
            count--;
            return -1;
        }
        if(root.left != null){
            int leftRoot= countNonLeafNodes(root.left);
            count++;
        }
        if(root.right != null){
            int rightRoot = countNonLeafNodes(root.right);
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println(countNonLeafNodes(root));
    }
}
