import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution49 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((node1, node2) -> Integer.compare(node1.val, node2.val));

        for (ListNode listHead : lists) {
            if (listHead != null) {
                minHeap.add(listHead);
            }
        }

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode;
            current = current.next;

            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }

        return dummyHead.next;
    }
}
