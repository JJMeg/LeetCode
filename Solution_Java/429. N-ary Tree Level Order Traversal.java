
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> per = new ArrayList<>();
        Queue<Node> node = new LinkedList<>();
        if (root == null)
            return result;
        node.offer(root);
        int curCount = 1;
        int nextCount = 0;
        while(!node.isEmpty()){
            Node temp = node.poll();
            per.add(temp.val);
            curCount--;
            if (temp.children!=null){
                for (Node n: temp.children){
                    node.offer(n);
                    nextCount ++;
                }
            }
            if (curCount==0){
                curCount = nextCount;
                nextCount = 0;
                result.add(new ArrayList<>(per));
                per.clear();
            }
        }
        return result;
    }
}
