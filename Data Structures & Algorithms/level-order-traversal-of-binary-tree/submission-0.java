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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if (root != null) {
            qu.add(root);
        }
        while(qu.size() != 0) {
            List<Integer> entry = new ArrayList<>();
            int s = qu.size();
            for (int i = 0;i < s; i++) {
                TreeNode n = qu.poll();
                entry.add(n.val);
                if (n.left != null) {
                    qu.add(n.left);
                }
                if (n.right != null) {
                    qu.add(n.right);
                }
            }
            ans.add(entry);
        }
        return ans;
    }
}
