/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode removeElements(ListNode head, int val) {
    ListNode fakeHead = new ListNode(-1);
    ListNode prev = fakeHead;
    ListNode current = head;
    prev.next = current;
    while (current != null) {
      if (current.val == val) prev.next = current.next;
      else prev = current;
      current = current.next;
    }

    return fakeHead.next;
  }
}