package 정렬.ATM;

import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int re[]=new int[N];
        for(int i=0; i<N; i++){
            re[i]=sc.nextInt();
        }
        Arrays.sort(re);
        int answer=0;
        int temp=0;
        int result[]=new int[N];
        for(int i=0; i<re.length; i++){
            temp+=re[i];
            result[i]=temp;
            answer+=result[i];
        }
        System.out.println(answer);

    }
}
