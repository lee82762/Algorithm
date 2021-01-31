package 이분탐색.예산;

import java.util.Arrays;
import java.util.Scanner;

//이분탐색코딩
public class Main1 {
    static int N;
    static  int M;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int re[]=new int[N];
        int sum=0;
        for(int i=0; i<N; i++){
            re[i]=sc.nextInt();
            sum+=re[i];
        }
        M=sc.nextInt();
        Arrays.sort(re);

        int first=0;
        int end=0;
        int mid=0;

        if(sum<=M){
            System.out.println(re[re.length-1]);
        }
        else{
            end=M;
            while (first<=end){

                int result=0;
                mid=(first+end)/2;
                for(int i=0; i<N; i++){
                    if(re[i]>mid){
                        result+=mid;
                    }
                    else{
                        result+=re[i];
                    }
                }
                if(result>M){
                    end=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
            System.out.println(end);


        }
    }

}
