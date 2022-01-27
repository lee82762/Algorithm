package 문자열.달팽이2;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int arr[][];
    static boolean visit[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new int[N][M];
        visit=new boolean[N][M];
        int i=0;
        int j=0;
        int cnt=0;
        int answer=0;

        while (true) {
            for (int k = 0; k < M - cnt; k++) {
                if (visit[i][j] == false) {
                    visit[i][j] = true;
                    j++;
                }
            }
            cnt++;
            j--;
            i++;
            answer++;
            if(visit[i][j]==true){
                break;
            }
            for (int k = 0; k < N - cnt; k++) {
                if (visit[i][j] == false) {
                    visit[i][j] = true;
                    i++;
                }
            }
            answer++;
            i--;
            j--;
            if(visit[i][j]==true){
                break;
            }
            for (int k = 0; k < M - cnt; k++) {
                if (visit[i][j] == false) {
                    visit[i][j] = true;
                    j--;
                }
            }
            answer++;
            cnt++;
            j++;
            i--;
            if(visit[i][j]==true){
                break;
            }
            for (int k = 0; k < N - cnt; k++) {
                if (visit[i][j] == false) {
                    visit[i][j] = true;
                    i--;
                }
            }
            answer++;
            i++;
            j++;
            if(visit[i][j]==true){
                break;
            }
        }
        System.out.println(answer-1);




    }
}
