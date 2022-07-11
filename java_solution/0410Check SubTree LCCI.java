// T1 and T2 are two very large binary trees. Create an algorithm to determine if T2 is a subtree of T1.

// A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2. That is, 
// if you cut off the tree at node n, the two trees would be identical.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null||t2==null){
            return false;
        }

        if(t1.val == t2.val){
            return checkSubTree(t1.left,t2.left)&&checkSubTree(t1.right,t2.right);
        }
        else{
            return checkSubTree(t1.left,t2)||checkSubTree(t1.right,t2);
        }

    }
}