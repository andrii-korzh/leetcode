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
  public int maxDepth(TreeNode root) {
    return maxDepth(root,0);
  }
  
  int maxDepth(TreeNode n, int depth){
    if( n == null) return depth;
    
    int left = maxDepth(n.left,depth+1);
    int right = maxDepth(n.right,depth+1);
    
    return left > right ? left : right;
  }
}
