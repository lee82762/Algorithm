package 정렬.좌표정렬하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int N;
    static int arr[][];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N][2];
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i][0]=a;
            arr[i][1]=b;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }
                else{
                    return  o1[0] - o2[0];
                }
            }
        });


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }


    }
}