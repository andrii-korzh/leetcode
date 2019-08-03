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
  public int minDepth(TreeNode root) {
    if(root == null) return 0;
    
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    int depth = 0;
    while(!q.isEmpty()) {
      depth++;
      int size = q.size();
      for(int i = 0; i < size; i++) {
        TreeNode n = q.poll();
        // System.out.println(n.val);
        if(n.left != null) q.offer(n.left);
        if(n.right != null) q.offer(n.right);
        if(n.left == null && n.right == null) return depth;
      }
    }
    return depth;
  }
}
