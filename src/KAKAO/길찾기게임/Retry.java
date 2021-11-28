package KAKAO.길찾기게임;

import java.util.*;
class Retry {
    static class Node{
        int x;
        int y;
        int node;
        Node leftnode;
        Node rightnode;
        public Node(int x, int y,int node){
            this.x=x;
            this.y=y;
            this.node=node;
        }
    }
    static int answer[][];
    static int cnt=0;
    public int[][] solution(int[][] nodeinfo) {
        int [][]nodesinfo=new int[nodeinfo.length][3];
        for(int i=0; i<nodeinfo.length; i++){
            nodesinfo[i][0]=nodeinfo[i][0];
            nodesinfo[i][1]=nodeinfo[i][1];
            nodesinfo[i][2]=i+1;
        }
        Arrays.sort(nodesinfo, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1]==o1[1]){
                    return o1[0]-o2[0];
                }
                return o2[1]-o1[1];
            }
        });
        Node root=new Node(nodesinfo[0][0],nodesinfo[0][1],nodesinfo[0][2]);
        for(int i=1; i<nodesinfo.length; i++){
            makeNode(root,new Node(nodesinfo[i][0],nodesinfo[i][1],nodesinfo[i][2]));
        }
        answer=new int[2][nodesinfo.length];
        middlepri(root);
        cnt=0;
        leftpri(root);
        return answer;
    }
    static public void makeNode(Node root, Node chile){
        if(root.x>chile.x){
            if(root.leftnode!=null){
                makeNode(root.leftnode,chile);
            }
            else{
                root.leftnode=chile;
            }
        }
        else{
            if(root.rightnode!=null){
                makeNode(root.rightnode,chile);
            }
            else{
                root.rightnode=chile;
            }
        }

    }

    static public void middlepri(Node root){
        if(root!=null){
            answer[0][cnt]=root.node;
            cnt++;
            middlepri(root.leftnode);
            middlepri(root.rightnode);
        }
    }
    static public void leftpri(Node root){
        if(root!=null){
            leftpri(root.leftnode);
            leftpri(root.rightnode);
            answer[1][cnt]=root.node;
            cnt++;
        }
    }

}
