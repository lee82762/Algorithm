package 문자열.findapeakelementii;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[] findPeakGrid(int[][] mat) {

        int answer[]=new int[2];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(bfs(i,j,mat)){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
            if(answer[0]!=0){
                break;
            }
        }
        return answer;
    }
    static boolean bfs(int x, int y,int mat[][]){
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(x,y));


        Pair p1=queue.poll();
        int x1=p1.x;
        int y1=p1.y;

        for(int i=0; i<4; i++){
            int x2=x1+dx[i];
            int y2=y1+dy[i];
            if(x2>=0&&x2<mat.length&&y2>=0&&y2<mat[0].length){

                if(mat[x1][y1]<mat[x2][y2]){
                    return false;

                }
            }
        }

        return true;
    }
}