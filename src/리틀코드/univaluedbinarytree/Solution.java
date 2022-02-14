package 리틀코드.univaluedbinarytree;

import java.util.HashSet;



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

    static HashSet<Integer> set;
    static boolean answer=true;
    public boolean isUnivalTree(TreeNode root) {

        if(root.right==null && root.left==null){
            return true;
        }
        dfs(root);
        return answer;
    }
    static public void dfs(TreeNode root){

        if(root==null){
            return;
        }

        if(!set.contains(root.val)){
            answer=false;
            return;
        }

        dfs(root.left);
        dfs(root.right);

    }
}
