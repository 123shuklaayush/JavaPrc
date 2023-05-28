package LinkedList;

import java.math.BigInteger;
import java.util.*;

public class sortList extends mainNode{
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr= head;
        while(curr != null){
            if(curr != null)
                arr.add(curr.val);
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;
        for(int i = 0; i < arr.size(); i++){
            pointer.val= arr.get(i);
            pointer = pointer.next;
        }
        return dummy.next;
    }
}
