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
	public boolean isCompleteTree(TreeNode root) {
		if( root == null) return true;

		Queue<TreeNode> q = new LinkedList<>();
		int level = 0;
		int levelLimit = 1;
		q.offer(root);
		boolean lastValidNode = false;
		while(!q.isEmpty()) {
			int size = q.size();
			for( int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				boolean hasLeft = node.left != null;
				boolean hasRight = node.right != null;
				if( lastValidNode && (hasLeft || hasRight)) return false;
				if( !hasLeft && hasRight) return false;
				if( !hasRight ) lastValidNode = true;

				if( hasLeft) q.offer(node.left);
				if( hasRight) q.offer(node.right);
			}

			level++;
			levelLimit<<=1;
		}

		return true;
	}
}