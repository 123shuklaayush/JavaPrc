package LinkedList;

public class binaryToInt extends mainNode {
    public int getDecimalValue(ListNode head) {
        int bin = 0;
        while(head != null){
            bin = bin * 2 + head.val;
            head = head.next;
        }
        return bin;
    }


    }
