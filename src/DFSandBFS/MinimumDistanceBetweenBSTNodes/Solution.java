package DFSandBFS.MinimumDistanceBetweenBSTNodes;


class Solution {
    int answer=Integer.MAX_VALUE;
    Integer re=null;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return answer;
    }
    public void dfs(TreeNode root){
        if(root==null)
            return;
        dfs(root.left);
        if(re!=null)
            answer=Math.min(root.val-re,answer);
        re=root.val;
        dfs(root.right);
    }
    public class TreeNode {
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
}