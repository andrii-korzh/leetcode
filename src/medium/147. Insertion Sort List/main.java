/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode insertionSortList(ListNode head) {
		if( head == null || head.next == null ) return head;

		ListNode pivot = head;
		ListNode n = null;
		while( pivot.next != null){
			n = pivot.next;
			if( n.val >= pivot.val) {
				pivot = n;
				continue;
			}
			pivot.next = n.next;

			if( n.val <= head.val) {
				n.next = head;
				head = n;
				continue;
			}

			ListNode current = head;
			while( current.next != n && n.val > current.next.val) current = current.next;
			n.next = current.next;
			current.next = n;
		}
		return head;
	}
}