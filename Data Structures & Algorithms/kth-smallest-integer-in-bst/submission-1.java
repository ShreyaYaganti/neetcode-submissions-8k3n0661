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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode>stack = new Stack<>();
        while(root!=null){
            stack.add(root);
            root=root.left;
        }
        int rank =0;
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            rank++;
            if(rank==k)return node.val;
            if(node.right!=null)stack.add(node.right);
        }
        return -1;
    }
}
