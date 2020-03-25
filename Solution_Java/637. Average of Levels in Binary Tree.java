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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> node = new LinkedList<TreeNode>();
        if (root == null)
            return result;
        node.offer(root);
        int curCount = 1;
        int num = curCount;
        int nextCount = 0;
        double sum = 0;
        double a = 0.0;
        while(!node.isEmpty()){
            TreeNode temp = node.poll();
            sum += (double)temp.val;
            curCount--;
            if (temp.left!=null){
                node.offer(temp.left);
                nextCount ++;
            }
            if (temp.right!=null){
                node.offer(temp.right);
                nextCount ++;
            }
            if (curCount==0){
                a = sum/(double)num;
                result.add(a);
                curCount = nextCount;
                nextCount = 0;
                num = curCount;
                sum = 0;
                a=0.0;
            }
        }
        return result;
    }
}
