package LinkedList;

public class driverLL extends sortListOfZerOneTwo{
    Node divide(int N, Node head){
        while(head == null) return null;
        Node curr = head;
        Node prev = head;
        Node trav = head;
        while(trav.next != null){
            prev = trav;
            if(trav.data % 2 == 0){
                Node temp = trav.next;
                curr.next = temp;
                trav.next = prev;
                prev.next = curr;
                curr = curr.next;
            }
            trav = trav.next;
        }
        return head;
    }
}
