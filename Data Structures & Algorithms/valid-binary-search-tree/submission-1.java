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
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        int[] ans = minMaxBST(root);
        if(ans[0]==Integer.MIN_VALUE)return false;
        return true;
    }
    public int[] minMaxBST(TreeNode root){
       if(root.left==null&&root.right==null) return new int[]{root.val,root.val};
       int left[] = root.left!=null?minMaxBST(root.left):new int[] {Integer.MAX_VALUE,Integer.MIN_VALUE};
       int right[] = root.right!=null?minMaxBST(root.right):new int[] {Integer.MAX_VALUE,Integer.MIN_VALUE};
       if(left[1]<root.val&&right[0]>root.val){
          return new int[]{Math.min(root.val,left[0]),Math.max(right[1],root.val)};
       }
        return new int[] {Integer.MIN_VALUE,Integer.MAX_VALUE};
    }
}
