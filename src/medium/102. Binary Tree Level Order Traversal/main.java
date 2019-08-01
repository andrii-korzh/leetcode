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
    public List<List<Integer>> levelOrder(TreeNode root) {
      Queue<TreeNode> q = new LinkedList<>();
      List<List<Integer>> r = new ArrayList<>();
      if( root != null) q.offer(root);
      while(!q.isEmpty()){
        int size = q.size();
        List<Integer> l = new LinkedList<>();
        for( int i = 0; i < size; i++){
          TreeNode n = q.poll();
          l.add(n.val);
          if( n.left != null) q.offer(n.left);
          if( n.right != null) q.offer(n.right);
        }
        r.add(l);
      }
      
      return r;
    }
}
