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

    public TreeNode helper(int []nums, int l, int r){
        if (l > r) return null;
        
        int mid = l + (r - l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, l, mid - 1);
        root.right = helper(nums, mid + 1, r);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
}
