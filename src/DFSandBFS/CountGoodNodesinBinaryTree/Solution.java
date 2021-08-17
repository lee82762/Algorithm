package DFSandBFS.CountGoodNodesinBinaryTree;
class TreeNode {
      int val;
      TreeNode left;

      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
  }
}


class Solution {
    static int answer=0;
    public int goodNodes(TreeNode root) {
        answer=0;
        if(root !=null){
            dfs(root,root.val);
        }

        return answer;

    }
    private void dfs(TreeNode node, int val) {

        val = Math.max(val, node.val);


        if (node.val >= val) {
            System.out.println(val);
            System.out.println(node.val);
            System.out.println(answer);
            answer++;
        }

        if (node.right != null) {
            dfs(node.right, val);
        }

        if (node.left != null) {
            dfs(node.left, val);
        }
    }
}
