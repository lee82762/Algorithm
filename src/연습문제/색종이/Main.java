package 연습문제.색종이;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        int a=sc.nextInt();
        int map[][]=new int[101][101];
        int cnt=0;
        for(int i=0; i<a; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    if(map[j][k]==1){
                        continue;
                    }
                    map[j][k]=1;
                    cnt++;

                }
            }
        }

        System.out.println(cnt);





    }
}
