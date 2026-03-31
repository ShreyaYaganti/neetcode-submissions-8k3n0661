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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        boolean left=true;
        boolean right=true;
        if(p.val!=q.val)return false;
        if(p.left!=null||q.left!=null)left = isSameTree(p.left,q.left);
        if(p.right!=null||q.right!=null)right = isSameTree(p.right,q.right);
        return left&&right;
    }
}
