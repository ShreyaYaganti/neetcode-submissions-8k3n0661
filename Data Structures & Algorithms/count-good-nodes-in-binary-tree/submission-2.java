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
        return findGoodNode(root,root.val);
    }

    private int findGoodNode(TreeNode root, int max){
        if(root==null)return 0;
        int val =0;
        if(root.val>=max)val++;
        val = val+findGoodNode(root.left,Math.max(root.val,max));
        val = val+findGoodNode(root.right,Math.max(root.val,max));
        return val;
    }
}
