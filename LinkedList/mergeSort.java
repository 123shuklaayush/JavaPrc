package LinkedList;

public class mergeSort extends sortListOfZerOneTwo{
    public static Node merge(Node l1, Node l2){
        Node ans = new Node(0);
        Node curr = ans;
        while(l1 != null && l2!= null){
            if(l1.data <l2.data){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null){
            curr.next =l1;
            l1 = l1.next;
        }
        if(l2 != null){
            curr.next = l2;
            l2 = l2.next;
        }
        return ans.next;
    }
    static Node mergeSort(Node head)
    {
        Node temp = head;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        temp.next = null;
        Node left_half = mergeSort(head);
        Node right_half = mergeSort(slow);
        return merge(left_half, right_half);
    }

}
