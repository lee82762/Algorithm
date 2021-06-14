package 문자열.지영공주님의마법거울;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String arr[][]=new String[N][N];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){
                arr[i][j]=String.valueOf(s.charAt(j));
            }
        }
        int T=sc.nextInt();


        if(T==1) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
        }
        else if(T==2){
            for(int i=0; i<N; i++){
                for(int j=N-1; j>=0; j--){
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
        }
        else{
            for(int i=N-1; i>=0; i--){
                for(int j=0; j<N; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
        }


    }
}
