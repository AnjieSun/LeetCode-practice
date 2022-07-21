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
    List<Integer> res = new LinkedList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        
        Recursive(root);
        return res;
    }

    public void Recursive(TreeNode node){
        if(node == null)return;
        if(node.left == null && node.right!= null){
            res.add(node.right.val);
            Recursive(node.right);
        }
        else if(node.left != null && node.right == null){
            res.add(node.left.val);
            Recursive(node.left);
        }
        else{
            Recursive(node.left);
            Recursive(node.right);
        }
    }
}