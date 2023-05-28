package LinkedList;

public class reverseLLiii extends mainNode{
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int count = 0;
        while(curr != null){
            curr = curr.next;
            count++;
            if(count>=left && count <=right){
                temp.next = curr;
                temp = temp.next;
            }
        }
        return reverse(temp);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

