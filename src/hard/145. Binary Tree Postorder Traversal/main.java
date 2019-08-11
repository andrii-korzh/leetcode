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
	public List<Integer> postorderTraversal(TreeNode root) {
		Deque<TreeNode> s = new ArrayDeque<>();
		Deque<TreeNode> s2 = new ArrayDeque<>();
		if( root != null) s.push(root);
		while(!s.isEmpty()){
			TreeNode n = s.pop();
			if( n.left != null) s.push(n.left);
			if( n.right != null) s.push(n.right);
			s2.push(n);
		}

		List<Integer> r = new LinkedList<>();
		while(!s2.isEmpty()) {
			r.add(s2.pop().val);
		}
		return r;
	}
}