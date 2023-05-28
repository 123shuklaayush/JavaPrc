package LinkedList;

public class reverseLinkedList extends sortListOfZerOneTwo{
    public static Node reverse(Node head){
        Node  currNode= head;
        Node prev = null;
        while(currNode!=null){
            Node temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode= temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node l1 = new Node(3);
        l1.next = new Node(10);
        l1.next.next = new Node(2);
       Node ans = reverse(l1);
       printList(l1);
    }
}
