package LinkedList;

public class removeLinkedListElements extends mainNode {
    public ListNode removeElements(ListNode head, int value) {
        while(head !=null && head.val == value){
            head = head.next;
        }
        ListNode currNode = head;
        while(currNode != null && currNode.next!=null){
            if(currNode.next.val == value){
                currNode.next = currNode.next.next;
            }
            else
                currNode = currNode.next;
        }
        return head;
    }
}
