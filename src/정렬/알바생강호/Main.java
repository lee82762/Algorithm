package 정렬.알바생강호;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//int , long 변수 적절히 사용하기
public class Main{
    static int  N;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            a1.add(a);
        }
        Collections.sort(a1,Collections.reverseOrder());

        long answer=0;
        int result=0;
        for(int i=0; i<N; i++){
            result=a1.get(i)-((i+1)-1);
            if(result>0){
                answer+=result;
            }


        }
        System.out.println(answer);




    }
}
