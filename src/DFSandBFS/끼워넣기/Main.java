package DFSandBFS.끼워넣기;

import java.util.Scanner;

public class Main {
    static int N;
    static int arr[];
    static int cal[];
    static int answer=0;
    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;
    //static int cnt=0;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        cal=new int[4];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<4; i++){
            cal[i]=sc.nextInt();
        }

        dfs(arr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
    static void dfs(int num,int cnt){
        if(cnt==N){
            max=Math.max(max,num);
            min=Math.min(min,num);
            return;
        }

        for(int i=0; i<4; i++){
            if(cal[i]>0){
                cal[i]--;

                if(i==0){
                    dfs(num+arr[cnt],cnt+1);

                }
                else if(i==1){
                    dfs(num-arr[cnt],cnt+1);

                }
                else if(i==2){
                    dfs(num*arr[cnt],cnt+1);

                }
                else{
                    dfs(num/arr[cnt],cnt+1);

                }

                cal[i]++;
            }
        }

    }


}
