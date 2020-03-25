
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> per = new ArrayList<>();
        Queue<TreeNode> node = new LinkedList<TreeNode>();
        if (root == null)
            return result;
        node.offer(root);
        int curCount = 1;
        int nextCount = 0;
        while(!node.isEmpty()){
            TreeNode temp = node.poll();
            per.add(temp.val);
            curCount-- ;
            if (temp.left!=null){
                node.offer(temp.left);
                nextCount++;
            }
            if(temp.right != null){
                node.offer(temp.right);
                nextCount++;
            }
            if (curCount==0){
              curCount = nextCount;
              nextCount = 0;
              result.add(new ArrayList<>(per));//new ArrayList<>(per)
              per.clear();
            }
        }
        return result;
    }
}
