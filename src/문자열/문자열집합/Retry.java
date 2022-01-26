package 문자열.문자열집합;

import java.util.ArrayList;
import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0; i<N; i++){
            temp.add(sc.next());
        }
        int answer=0;
        for(int i=0; i<M; i++){
            String s=sc.next();
            if(temp.contains(s)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}