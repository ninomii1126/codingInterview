import java.util.*;

public class SwapNodesInPairs{
    public static LinkedListNode swapPairs(LinkedListNode head) {

    // Replace this placeholder return statement with your code
    LinkedListNode node = head;
    LinkedListNode lastGroupEnd = null;

    while(node !=null && node.next != null){

      LinkedListNode curr = node;
      LinkedListNode next = null;
      LinkedListNode prev = null;

      for(int i=0; i<2; i++){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }

      LinkedListNode tail = node;
      tail.next = curr;
      
      // check if it is first group
      // - first group : Update head pointer
      // - after first group: link the last node of 
      // previous group to current group
      if(lastGroupEnd == null){
        head = prev; 
      }else{
        lastGroupEnd.next = prev;
      }
      lastGroupEnd = tail;
      node = curr;
    }

    return head;
  }


}