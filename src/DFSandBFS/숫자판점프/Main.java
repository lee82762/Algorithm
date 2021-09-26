package DFSandBFS.숫자판점프;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int arr[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static ArrayList<String>a1=new ArrayList<>();
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=5;
        arr=new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j]=sc.nextInt();
            }
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                dfs(i,j,"");
            }
        }
        System.out.println(a1.size());

    }
    static void dfs(int x, int y,String str){
        if(str.length()==6){
            if(!a1.contains(str)){
                a1.add(str);
            }
            return;
        }

        for(int i=0; i<4; i++){
            int x2=x+dx[i];
            int y2=y+dy[i];
            if(x2>=0&&x2<N&&y2>=0&&y2<N){
                dfs(x2,y2,str+Integer.toString(arr[x2][y2]));
            }
        }
    }
}