package 이분탐색.숫자카드;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//텔레포트 정거장
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(check(cards, N, temp) + " ");
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();



    }
    static int check(int a[],int N,int k){
        int left=0;
        int right=a.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(k==a[mid]){
                return 1;
            }

            if(k<a[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return 0;
    }
}
