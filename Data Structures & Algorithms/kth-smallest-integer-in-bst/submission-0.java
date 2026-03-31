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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return -1;
        if(root.left!=null) {
            int val =kthSmallest(root.left,k);
            if(val!=-1)return val;}
        count++;
        System.out.println(count+" "+root.val);
        if(count==k)return root.val;
        if(root.right!=null){
       int val = kthSmallest(root.right,k);
       if(val!=-1)return val;
        } 
        return -1;
    }
}
