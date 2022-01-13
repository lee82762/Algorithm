package 정렬.중복빼고정렬하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static  int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        ArrayList<Integer> answer =new ArrayList<>();
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            if(!answer.contains(a)){
                answer.add(a);
            }
        }
        Collections.sort(answer);

        for(int i=0; i<answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }

    }
}
