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
    public int maxDepth(TreeNode root) {
        return maxD(root,0);
    }
    public int maxD(TreeNode root,int pos){
        if(root==null){
            return pos;
        }
        int a,b;
        a=maxD(root.left,pos+1);
        b=maxD(root.right,pos+1);
        return Math.max(a,b);
    }
}