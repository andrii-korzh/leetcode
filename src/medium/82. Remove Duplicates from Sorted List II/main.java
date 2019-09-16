/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return head;
    ListNode prev = new ListNode(-1);
    prev.next = head;
    ListNode current = head;

    ListNode newHead = prev;
    while (current != null) {
      if (current.next != null && current.next.val == current.val) {
        prev.next = nextNode(current.next);
        current = prev.next;
      } else {
        prev = current;
        current = current.next;
      }
    }
    return newHead.next;
  }

  ListNode nextNode(ListNode n) {
    int val = n.val;
    while (n != null && n.val == val) n = n.next;
    return n;
  }
}