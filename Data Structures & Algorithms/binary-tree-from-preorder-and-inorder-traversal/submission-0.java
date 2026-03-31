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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(index>preorder.length)return null;
        int root = preorder[index];
        TreeNode node = new TreeNode(root);
        index++;
        int i=0;
        for(i=0;i<inorder.length;i++){
            if(root==inorder[i])break;
        }
        if(i-1>=0){
        int inorder_left[] = Arrays.copyOfRange(inorder,0,i);
        node.left = buildTree(preorder,inorder_left);
        }
        
        if(i+1<inorder.length){
        //System.out.println(i+1+" "+inorder.length);
        int inorder_right[] = Arrays.copyOfRange(inorder,i+1,inorder.length);
        //left is 0 to i-1;
        
        //right 
        node.right = buildTree(preorder,inorder_right);}
        return node;
    }
}
