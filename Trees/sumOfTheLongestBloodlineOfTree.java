package Trees;

public class sumOfTheLongestBloodlineOfTree {
    static int maxHeightSum = Integer.MIN_VALUE;

    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int sum = 0;
        if(root == null) return 0;
        int maxHeight = 0;
        int height = 0;
        helper(root, sum, maxHeightSum, height, maxHeight);
        return maxHeightSum;
    }
    void helper(Node root, int sum, int maxHeightSum, int height, int maxHeight){
        if(root == null){
            if(maxHeight < height){
                maxHeightSum = sum;
                maxHeight = height;
                return;
            }
            else if(height == maxHeight){
                maxHeightSum = Math.max(maxHeightSum, sum);
            }
            return;
        }
        sum += root.data;

        helper(root.left, sum, maxHeightSum, height+1, maxHeight);
        helper(root.right, sum, maxHeightSum, height+1, maxHeight);
    }
    public static void main(String[] args) {
        // Create the binary tree
        Node rootNode = new Node(4);
        rootNode.left = new Node(2);
        rootNode.right = new Node(5);
        rootNode.left.left = new Node(7);
        rootNode.left.right = new Node(1);
        rootNode.right.left = new Node(2);
        rootNode.right.right = new Node(3);
        rootNode.left.right.left = new Node(6);

        // Create the BinaryTree object and call sumOfLongRootToLeafPath() method
        sumOfTheLongestBloodlineOfTree tree = new sumOfTheLongestBloodlineOfTree();
        int result = tree.sumOfLongRootToLeafPath(rootNode);
        System.out.println("Maximum sum of a path from root to leaf: " + result);
    }
}
