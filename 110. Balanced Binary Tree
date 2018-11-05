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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int getDepth(TreeNode root){
        int depth = 0;
        if (root == null)
            return 0;
        int left = 1 + getDepth(root.left);
        int right = 1 + getDepth(root.right);
        if (left > right)
            return left;
        else
            return right;
        
    }
}
