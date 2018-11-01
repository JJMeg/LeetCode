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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        if (root == null)
            return result;

        if (root.left == null && root.right == null){
            result.add(String.valueOf(root.val) + "");
            return result;
        }

        if (root.left != null){
            for(String path: binaryTreePaths (root.left)){
                result.add(String.valueOf(root.val) + "->" + path);
            }
        }
        
        if (root.right != null){
            for(String path: binaryTreePaths (root.right)){
                result.add(String.valueOf(root.val) + "->" + path);
            }
        }
        return result;
    }

    
}
