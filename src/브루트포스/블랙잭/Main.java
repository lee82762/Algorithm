package 브루트포스.블랙잭;

import java.util.Scanner;

public class Main {
    static  int N;
    static  int M;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        int a[]=new int[N];

        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
        }



        int answer=0;

        for(int i=0; i<N; i++){
            int temp1=0;
            temp1+=a[i];
            for(int j=0; j<N; j++){
                int temp2=0;
                if(i==j){
                    continue;
                }
                else{
                    temp2=temp1+a[j];
                }
                for(int k=0; k<N; k++){
                    int temp3=0;
                    if(k==i||k==j){
                        continue;
                    }
                    else{
                        temp3=temp2+a[k];
                    }


                    if(temp3>answer&&temp3<=M){
                        answer=temp3;
                    }
                    temp3=0;

                }

            }
        }
        System.out.println(answer);


    }

}
