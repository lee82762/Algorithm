package KAKAO.길찾기게임;

import java.util.*;
class Solution {
    static int answer[][];
    static int cnt=0;
    static class Node{
        int x;
        int y;
        int node;
        Node left;
        Node right;
        public Node (int node, int x , int y ){
            this.node=node;
            this.x=x;
            this.y=y;
        }
    }
    public int[][] solution(int[][] nodeinfo) {
        int nodeinfo1[][]=new int[nodeinfo.length][3];
        for(int i=0; i<nodeinfo1.length; i++){
            nodeinfo1[i][0]=nodeinfo[i][0];
            nodeinfo1[i][1]=nodeinfo[i][1];
            nodeinfo1[i][2]=i+1;
        }
        Arrays.sort(nodeinfo1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                else {
                    return o2[1] - o1[1];
                }
            }
        });
        Node root=new Node(nodeinfo1[0][2],nodeinfo1[0][0],nodeinfo1[0][1]);
        for(int i=1; i<nodeinfo1.length; i++){
            makenode(root,new Node(nodeinfo1[i][2],nodeinfo1[i][0],nodeinfo1[i][1]));
        }
        answer=new int[2][nodeinfo.length];
        inorder(root);
        cnt=0;
        postorder(root);
        return answer;
    }
    static public void makenode(Node root,Node child){
        if(root.x>child.x){
            if(root.left!=null){
                makenode(root.left,child);
            }
            else{
                root.left=child;
            }
        }
        else{
            if(root.right!=null){
                makenode(root.right,child);
            }
            else{
                root.right=child;
            }

        }
    }
    static public void inorder(Node root){

        if(root!=null){
            answer[0][cnt]=root.node;
            cnt++;
            inorder(root.left);
            inorder(root.right);
        }
    }
    static public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            answer[1][cnt]=root.node;
            cnt++;
        }
    }
}
