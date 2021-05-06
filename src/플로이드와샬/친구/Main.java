package 플로이드와샬.친구;


import java.util.Scanner;

public class Main {
    static  int N;
    static  int arr[][];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        arr=new int[N][N];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){

                char c=s.charAt(j);
                if(c=='Y'){
                    arr[i][j]=1;
                }
                else if(i!=j){
                    arr[i][j]=100000000;
                }
            }
        }



        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                }
            }
        }
        int  answer=0;
        for(int i=0; i<N; i++){
            int temp=0;
            for(int j=0; j<N; j++){
                if(i==j){
                    continue;
                }
                else{
                    if(arr[i][j]<=2){
                        temp++;

                    }
                }
            }
            answer=Math.max(answer,temp);
        }
        System.out.println(answer);

    }
}




