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

   public boolean helper(TreeNode root, long l, long r) {
      if (root == null) return true;
      if (root.val <= l || root.val >= r) return false;
      return helper(root.left, l, root.val) && helper(root.right, root.val, r);
   }
   
   public boolean isValidBST(TreeNode root) {
      long min = Long.MIN_VALUE;
      long max = Long.MAX_VALUE;
      return helper(root, min, max);
   }
}
