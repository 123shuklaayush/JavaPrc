package LinkedList;

import org.w3c.dom.NodeList;

public class mainNode{
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            next = null;
        }
    }

    public static void printNode(ListNode head){
        while(head!=null){
            System.out.print(head.val + "->");
            if(head.next !=null)
                head = head.next;
            System.out.println();
        }
    }
}
