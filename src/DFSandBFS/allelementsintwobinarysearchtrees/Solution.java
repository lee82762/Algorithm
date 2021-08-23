package DFSandBFS.allelementsintwobinarysearchtrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
    List<Integer> a1=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        if(root1==null&&root2==null){
            return a1;
        }

        dfs(root1);
        dfs(root2);
        Collections.sort(a1);


        return a1;
    }
    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        else{
            a1.add(node.val);
            dfs(node.right);
            dfs(node.left);
        }

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
