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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0 || nums == null)
            return null;
        int length = nums.length;
        int middle = (length-1)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,middle));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,middle+1,length));
        return root;
    }
}
