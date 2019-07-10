/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// return recursion(l1,l2);
		return iterative(l1, l2);
	}

	ListNode iterative(ListNode a, ListNode b) {
		ListNode prehead = new ListNode(-1);

		ListNode prev = prehead;
		while (a != null && b != null) {
			if (a.val < b.val) {
				prev.next = a;
				a = a.next;
			} else {
				prev.next = b;
				b = b.next;
			}
			prev = prev.next;
		}

		prev.next = a != null ? a : b;

		return prehead.next;
	}

	ListNode recursion(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = recursion(l1.next, l2);
			return l1;
		} else {
			l2.next = recursion(l1, l2.next);
			return l2;
		}
	}
}