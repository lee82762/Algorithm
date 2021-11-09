package DFSandBFS.구슬찾기;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String arg[])throws IOException {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int [][]map=new int[N][N];
        for(int a[]:map){
            Arrays.fill(a, 100000000);
        }
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            map[a-1][b-1]=1;
        }

        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i==j) continue;
                    map[i][j]=Math.min(map[i][j], map[i][k]+map[k][j]);
                }
            }
        }
        int row[]=new int[N];
        int col[]=new int[N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==j || map[i][j]==100000000) continue;
                row[i]++;
                col[j]++;
            }
        }

        int ref = N / 2 + 1;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (row[i] >= ref) answer++;
            if (col[i] >= ref) answer++;
        }
        System.out.println(answer);

    }
}