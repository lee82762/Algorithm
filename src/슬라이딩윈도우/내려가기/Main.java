package 슬라이딩윈도우.내려가기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[][]=new int[N+1][3];
        int max[][]=new int[N+1][3];
        int min[][]=new int[N+1][3];

        for(int i=1; i<=N; i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();

            max[i][0]=Math.max(max[i-1][0],max[i-1][1]);
            max[i][0]+=arr[i][0];

            max[i][1]=Math.max(max[i-1][0],Math.max(max[i-1][1],max[i-1][2]));
            max[i][1]+=arr[i][1];

            max[i][2]=Math.max(max[i-1][1],max[i-1][2]);
            max[i][2]+=arr[i][2];

            min[i][0]=Math.min(min[i-1][0],min[i-1][1]);
            min[i][0]+=arr[i][0];

            min[i][1]=Math.min(min[i-1][0],Math.min(min[i-1][1],min[i-1][2]));
            min[i][1]+=arr[i][1];

            min[i][2]=Math.min(min[i-1][1],min[i-1][2]);
            min[i][2]+=arr[i][2];

        }

        int max1 = Math.max(max[N][0],Math.max(max[N][1],max[N][2]));
        int min1 = Math.min(min[N][0],Math.min(min[N][1],min[N][2]));
        System.out.println(max1+" "+min1);


    }

}
