/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> r = new LinkedList<>();
		Deque<TreeNode> s = new ArrayDeque<>();
		if (root != null) s.push(root);
		while (!s.isEmpty()) {
			TreeNode n = s.pop();
			if (n.right != null) s.push(n.right);
			if (n.left != null) s.push(n.left);
			r.add(n.val);
		}
		return r;
	}
}