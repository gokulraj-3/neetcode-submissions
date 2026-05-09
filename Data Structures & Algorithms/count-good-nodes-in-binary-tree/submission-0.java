/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        int[] ans = new int[]{0};
        int max = Integer.MIN_VALUE;
        helper(ans, root, max);
        return ans[0];
    }
    public void helper(int[] ans, TreeNode root, int max) {
        if(root == null) {
            return;
        }
        if (root.val >= max) {
            ans[0]++;
            max = root.val;
        }
        helper(ans,root.left,max);
        helper(ans,root.right,max);
    }
}
