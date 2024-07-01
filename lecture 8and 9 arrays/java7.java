import java.util.*;

public class java7{
    public ListNode reverseList(ListNode head) {
        ListNodeNode prev=null;
        ListNodeNode curr=head;
        ListNodeNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

            curr=curr.next;

        }
        return head;
    } 
    public static void main(String args[]){
      LinkedList<Integer> ListNode=new LinkedList<>();
      ListNode.addFirst(5);
      ListNode.addFirst(4);
      ListNode.addFirst(3);
      ListNode.addFirst(2);
      ListNode.addFirst(1);

      reverseList(ListNode);
    }
}