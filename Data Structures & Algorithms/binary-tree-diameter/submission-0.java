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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        helper(root,max);
        return max[0];
    }
    public int helper(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int l = helper(root.left,max);
        int r = helper(root.right,max);
        int val = l+r;
        if(max.length == 0){
            max[0] = val;
        } else {
            max[0] = Math.max(max[0],val);
        }
        return Math.max(l+1,r+1);
    }
}
