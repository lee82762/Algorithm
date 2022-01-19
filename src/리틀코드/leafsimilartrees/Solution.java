package 리틀코드.leafsimilartrees;


import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> a1;
    static ArrayList<Integer> a2;
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        a1 = new ArrayList<>();
        a2 = new ArrayList<>();
        check(root1,1);
        check(root2,2);
        System.out.println(a1);
        System.out.println(a2);
        boolean answer=true;
        if(a1.size() != a2.size()){
            return false;
        }
        for(int i=0; i<a1.size(); i++){
            if(a1.get(i)!=a2.get(i)){
                answer=false;
                break;
            }
        }
        return answer;
    }
    static public void check(TreeNode root,int n){
        if(root==null){
            return;
        }

        if(root.right == null && root.left == null){
            if(n==1){
                a1.add(root.val);
            }
            else{
                a2.add(root.val);
            }
        }


        check(root.left,n);
        check(root.right,n);
    }
}
