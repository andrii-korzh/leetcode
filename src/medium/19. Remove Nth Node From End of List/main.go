/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeNthFromEnd(head *ListNode, n int) *ListNode {
  if( head == nil) {
    return nil;
  }
  start := &ListNode{-1,head};
  start.Next = head;
  fast := start;
  for i := 0; i <= n; i++ {
    fast = fast.Next;
    // if( fast == null) return null;
  }
  // if( fast == null) return null;
  // System.out.println(fast.val);
  slow := start;
  for fast != nil {
    fast = fast.Next;
    slow = slow.Next;
  }
  slow.Next = slow.Next.Next;

  return start.Next;
}