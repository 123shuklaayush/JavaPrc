package LinkedList;

public class sortListOfZerOneTwo {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static Node segregate(Node head){
        Node temp = head;
        int zero = 0;
        int ones = 0;
        int two  = 0;

        while(temp !=null){
            if(temp.data == 1)
                ones++;
            else if(temp.data == 2)
                two++;
            else if(temp.data == 0)
                zero++;
            temp = temp.next;
        }
        temp = head;
        while(zero>0){
            temp.data = 0;
            temp = temp.next;
            zero--;
        }
        while(ones>0){
            temp.data = 1;
            temp = temp.next;
            ones--;
        }
        while(two>0){
            temp.data = 2;
            temp = temp.next;
            two--;
        }
        return head;
    }
    static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data);
            if(node.next != null)
                System.out.print("->");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(1);
        first.next.next = new Node(0);
        printList(first);
        Node n = segregate(first);
        printList(n);

    }
}
