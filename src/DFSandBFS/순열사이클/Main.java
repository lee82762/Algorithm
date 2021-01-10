package DFSandBFS.순열사이클;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
            int a=sc.nextInt();
            int a2[]=new int[a];
            for(int j=0; j<a2.length; j++){
                a2[j] = sc.nextInt();
            }
            boolean visit1[]=new boolean[a2.length];
            int answer=0;
            for(int k=0; k<a2.length; k++){
                if(!visit1[k]){
                    answer++;
                    dfs(a2,k,visit1);
                }
            }
            System.out.println(answer);

        }
    }
    public static void dfs(int []a1, int i, boolean []visit){
        for(int j=0; j<a1.length; j++){
            if(a1[i]==j+1&&visit[j]==false){
                visit[j]=true;
                dfs(a1,j,visit);
            }
        }

    }

}
