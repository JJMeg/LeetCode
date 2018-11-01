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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null)
            return sum;
        TreeNode l = root.left;
        if (l == null)
            return sum + sumOfLeftLeaves(root.right);
        if (l.left == null && l.right == null)
            sum += l.val ;
        else
            sum += sumOfLeftLeaves(l);
        if (root.right != null){
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }
}
