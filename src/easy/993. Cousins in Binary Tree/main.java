/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public boolean isCousins(TreeNode root, int x, int y) {
		if (root == null) return false;

		Queue<TreeNode[]> q = new LinkedList<>();
		q.offer(new TreeNode[]{root, null});
		while (!q.isEmpty()) {
			int size = q.size();
			TreeNode xParent = null;
			TreeNode yParent = null;
			for (int i = 0; i < size; i++) {
				TreeNode[] nodes = q.poll();
				TreeNode n = nodes[0];
				if (n.val == x) xParent = nodes[1];
				else if (n.val == y) yParent = nodes[1];
				if (xParent != null && yParent != null && xParent.val != yParent.val) return true;

				if (n.left != null) q.offer(new TreeNode[]{n.left, n});
				if (n.right != null) q.offer(new TreeNode[]{n.right, n});
			}
		}
		return false;
	}
}