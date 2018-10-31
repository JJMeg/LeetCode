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
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        if (root.children == null)
            return 1;
        int depth = 0;
        for (Node n: root.children){
            int temp = maxDepth(n);
            if (depth < temp)
                depth = temp;
        }
        return depth + 1;
    }
}
