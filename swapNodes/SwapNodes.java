import java.util.*;

public class SwapNodes {
  public static LinkedListNode swapNodes(LinkedListNode head, int k) {

    // Replace this placeholder return statement with your code

    LinkedListNode curr = head;
    int count = 0;

    LinkedListNode front = null;
    LinkedListNode end = null;

    while (curr != null) {
      count++;

      if (count == k) {
        front = curr;
        end = head;
      }

      if (count > k) {
        end = end.next;
      }

      curr = curr.next;
    }

    // swap values
    int endValue = end.data;
    int frontValue = front.data;

    front.data = endValue;
    end.data = frontValue;

    return head;
  }
}