package LinkedList;

public class  findMIddleNode extends mainNode {
public static ListNode middleNode(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        int mid = len/2;
        temp = head;
        while(mid != 0){
            temp = temp.next;
            mid--;
        }
        return temp;
}

    public static void main(String[] args) {

    }

}
