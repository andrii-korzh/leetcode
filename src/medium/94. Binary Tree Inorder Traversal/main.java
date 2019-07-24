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
  public List<Integer> inorderTraversal(TreeNode root) {
    LinkedList<Integer> r = new LinkedList<>();
    Deque<TreeNode> s = new ArrayDeque<>();
    TreeNode n = root;
    while( n != null || !s.isEmpty()){
      while( n != null){
        s.push(n);
        n = n.left;
      }
      
      n = s.pop();
      r.add(n.val);
      n = n.right;
    }
    return r;
  }
  
}
