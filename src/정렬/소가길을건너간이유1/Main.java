package 정렬.소가길을건너간이유1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int map[];
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[11];
        Arrays.fill(map,-1);
        int answer=0;
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(map[a]==-1){
                map[a]=b;
            }
            else if(map[a]==b){
                continue;
            }
            else if(map[a]!=b) {
                map[a]=b;
                answer++;
            }
        }
        System.out.println(answer);

    }
}
