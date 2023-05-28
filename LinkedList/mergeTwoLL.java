package LinkedList;

public class mergeTwoLL extends mainNode{
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }
            else{
                curr.next = list1;
                list1 = list1.next;
            }
        }
        if(list1 != null){
            curr.next = list1;
            list1= list1.next;
        }
        if(list2 != null){
            curr.next = list2;
            list2 = list2.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next =new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(list1, list2));
    }
}
