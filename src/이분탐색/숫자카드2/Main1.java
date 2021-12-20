package 이분탐색.숫자카드2;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            map.put(a,map.getOrDefault(a,0)+1);
        }

        int M=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<M; i++) {
            int k = sc.nextInt();
            if(map.get(k)==null){
                sb.append(0+" ");
            }
            else {
                sb.append(map.get(k) + " ");
            }
        }
        System.out.println(sb);

    }
}
