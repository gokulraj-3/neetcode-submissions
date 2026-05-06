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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root!=null) {
            qu.add(root);
        }
        while(qu.size()!=0) {
            int s = qu.size();
            TreeNode ele = null;
            while(s!=0) {
                ele = qu.poll();
                s--;
                if(ele.left != null) {
                qu.add(ele.left);
            }
            if(ele.right != null) {
                qu.add(ele.right);
            }
            }
            ans.add(ele.val);
        }
        return ans;
    }
}
