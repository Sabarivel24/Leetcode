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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean leftright=true;
        while(!q.isEmpty()){
            int s=q.size();
            Integer[] level=new Integer[s];
            int i=0;
            while(i<s){
                TreeNode t=q.poll();
                int index=leftright?i:s-i-1;
                level[index]=t.val;
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                i++;
            }
            ans.add(Arrays.asList(level));
            leftright=!leftright;
        } 
        return ans;
    }
}