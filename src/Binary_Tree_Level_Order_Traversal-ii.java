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

    public void helper(TreeNode root, List<List<Integer>> ans, int h) {
        if (root == null) return;
        if (ans.size() == h) {
            ans.add(0, new ArrayList<Integer>());
        }
        ans.get(ans.size() - h - 1).add(root.val);
        helper(root.left, ans, h+1);
        helper(root.right, ans, h+1);
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(root, ans, 0);
        return ans;
    }
}
