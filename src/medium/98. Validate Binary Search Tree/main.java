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
  int min = 1 << 31;
  int max = -1 >>> 1;
  public boolean isValidBST(TreeNode root) {
    if( true)  return iterative(root);
    return isBST(root, null, null);    
  }
  
  boolean iterative(TreeNode root) {
    if( root == null) return true;
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode pre = null;
    while(root != null || !stack.isEmpty()){
      while( root != null) {
        stack.push(root);
        root = root.left;
      }
      
      root = stack.pop();
      if( pre != null && root.val <= pre.val) return false;
      pre = root;
      root = root.right;
    }
    
    return true;
  }
  
  
//  2
// 1 3
// -x p.val - 1  
  boolean isBST(TreeNode n, Integer min, Integer max){
    if( n == null) return true;
    if( min != null && n.val <= min) return false;
    if( max != null && n.val >= max) return false;
    
    return isBST(n.left,min, n.val) && isBST(n.right, n.val, max);
  }
}
