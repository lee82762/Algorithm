package 문자열.도비의난독증테스트;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int T;
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            T = sc.nextInt();
            if(T==0){
                break;
            }
            String arr[] = new String[T];
            String tmp[] = new String[T];
            for (int i = 0; i < T; i++) {
                String s = sc.next();
                arr[i] = s;
                tmp[i] = s.toLowerCase();
            }
            Arrays.sort(tmp);
            String re = tmp[0];
            String answer = "";
            for (int i = 0; i < arr.length; i++) {
                String s = arr[i];
                if (s.toLowerCase().equals(re)) {
                    answer = s;
                    break;
                }
            }
            System.out.println(answer);


        }
    }

}