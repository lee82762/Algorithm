package 리틀코드.floodfill;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static int M;
    static int N;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        M=image.length;
        N=image[0].length;
        visit=new boolean[M][N];
        bfs(image,sr,sc,newColor);
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                if(visit[i][j]==true){
                    image[i][j]=newColor;
                }
            }
        }
        return image;
    }
    static public void bfs(int [][]image,int x,int y,int color){

        Queue<Integer> qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<M&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false&&image[x2][y2]==image[x1][y1]){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;

                    }
                }
            }
        }

    }
}
