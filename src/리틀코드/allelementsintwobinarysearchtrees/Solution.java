package 리틀코드.allelementsintwobinarysearchtrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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
    static List<Integer> a1;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        a1=new ArrayList<>();
        if(root1==null&&root2==null){
            return a1;
        }
        dfs(root1);
        dfs(root2);
        Collections.sort(a1);
        return a1;
    }
    public static void dfs(TreeNode root){
        if(root==null){
            return;
        }
        a1.add(root.val);

        dfs(root.left);
        dfs(root.right);
    }

}
