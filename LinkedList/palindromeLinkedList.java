package LinkedList;

public class palindromeLinkedList extends mainNode{
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode last = reverse(mid.next);
        ListNode curr = head;
        while(last != null){
            if(last.val != curr.val){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }
    public static ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode currNode = head;
        ListNode prev= null;
        while(currNode != null){
            ListNode temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;
        }
        return prev;
    }
}
