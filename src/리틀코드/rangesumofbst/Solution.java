package 리틀코드.rangesumofbst;


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
    static int answer=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        answer=0;
        check(root,low,high);
        return answer;
    }
    static public void check(TreeNode root,int low, int high){
        if(root==null){
            return;
        }
        if(root.val>= low && root.val<=high){
            answer+=root.val;
        }

        check(root.left,low,high);
        check(root.right,low,high);


    }
}
