import java.util.*;

public class Reorder{
    public static LinkedListNode reorderList(LinkedListNode head) {

    LinkedListNode fast = head.next;
    LinkedListNode slow = head;

    // find the middle node
    while(fast != null && fast.next != null){
      fast = fast.next.next;
      slow = slow.next;
    }

    // reverse the second half of linkedlist
    LinkedListNode curr = slow.next;
    LinkedListNode prev = null;
    LinkedListNode next = null;

    // break the conection of two halfs linkedlist
    slow.next = null;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    LinkedListNode first = head;
    LinkedListNode second = prev;

    // merge the first and second half of linked list
    LinkedListNode tmp1 = null;
    LinkedListNode tmp2 = null;
    
    while (second!=null){ 
      tmp1 = first.next;
      tmp2 = second.next;
      first.next=second;
      second.next =tmp1;

      first = tmp1;
      second = tmp2;
    }
    
    return head;
  }

}