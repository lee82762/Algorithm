package 이분탐색.좋다;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int arr[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int answer=0;
        for(int i=0; i<N; i++){
            int first=0;
            int last=N-1;
            int target=arr[i];
            while (first<last){
                int sum=arr[first]+arr[last];
                if(sum<target){
                    first++;
                }
                else if(sum>target){
                    last--;
                }
                else{
                    if(first!=i && last!=i){
                        answer++;
                        break;
                    }
                    if(first==i){
                        first++;
                    }
                    if(last==i){
                        last--;
                    }
                }

            }
        }
        System.out.println(answer);
    }
}
