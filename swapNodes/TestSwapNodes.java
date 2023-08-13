package testSwapNodes;

import org.junit.Test;
import org.junit.Assert;

import linkedList.LinkedList;
import linkedList.LinkedListNode;
import swapNodes.SwapNodes;

public class TestSwapNodes {
    @Test
    public void SwapNodeIsCorrect() throws Exception {
        int[] linkedListValue = {1, 2, 3, 4, 5, 6, 7, 8};
        LinkedList<Integer> testList = new LinkedList<Integer>();

        testList.createLinkedList(linkedListValue);
        LinkedListNode swappedLinkedListHead = SwapNodes.swapNodes(testList.head, 1);
        Assert.assertEquals(swappedLinkedListHead.data, 8);
    }
}