package 연습문제.멀쩡한사각형;

public class Solution {
    public static void main(String arg[]){
        int w=12;
        int h=8;
        int [][]map=new int[12][8];
        for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                map[i][j]=1;
               System.out.print(map[i][j]);
            }
            System.out.println(" ");
        }
        int row=w;
        int col=h;
        while(true){
            row--;
            col--;
            map[row][col]=0;

        }

    }
}
