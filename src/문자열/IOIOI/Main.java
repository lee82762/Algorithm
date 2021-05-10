package 문자열.IOIOI;

import java.util.Scanner;

public class Main {
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        String s=sc.next();

        int temp[]=new int[n];
        int arr=0;
        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            if(c=='I'){
                temp[arr++]=i;
            }
        }


        int answer=0;
        int cnt=0;
        for(int i=1; i<arr; i++){
            if(temp[i]-temp[i-1]==2){
                cnt++;
            }
            else{
                cnt=0;
            }

            if(cnt>=k){
                answer++;
            }
        }
        System.out.println(answer);

    }
}
