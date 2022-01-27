package 정렬.좌표정렬하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int temp[][]=new int[N][2];

        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            temp[i][0]=a;
            temp[i][1]=b;
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        for(int a[] : temp) {
            System.out.println(a[0]+" "+a[1]);

        }
    }
}
