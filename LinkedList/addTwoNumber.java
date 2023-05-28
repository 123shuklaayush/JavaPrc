package LinkedList;

public class addTwoNumber extends mainNode{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = reverse(l1);
        ListNode curr2 = reverse(l2);
        int num1 = 0;
        int num2 = 0;
        while(curr1 != null || curr2 != null){
            if(curr1 != null){
                num1 = num1* 10 + curr1.val;
                curr1 = curr1.next;
            }
            if(curr2 != null){
                num2 = num2 * 10 + curr2.val;
                curr2 = curr2.next;

            }
        }
        int sum = num1 + num2;
        String str = Integer.toString(sum);
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        int lenOfStr = str.length();
        int i = 0;
        while(lenOfStr> 0){
            temp.val = str.charAt(i) - '0';
            i++;
            temp = temp.next;
            lenOfStr--;
        }
        return newNode;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
