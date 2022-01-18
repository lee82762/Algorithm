package 리틀코드.sumofroottoleafbinarynumbers;

// 루트노드에서 리프노드로 가는 알고리즘 이용
class Solution {
    static public class TreeNode {
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
    static int total;
    public int sumRootToLeaf(TreeNode root) {
        total=0;
        if(root==null){
            return 0;
        }
        sum(root,0);
        return total;

    }
    public void sum(TreeNode root, int n){
        if(root==null){
            return;
        }

        int cur=n*2+root.val;
        if(root.left ==null && root.right==null){
            System.out.println(cur);
            total+=cur;
            return;
        }

        sum(root.left,cur);
        sum(root.right,cur);
    }
}