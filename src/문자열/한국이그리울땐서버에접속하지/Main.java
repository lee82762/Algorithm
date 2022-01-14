package 문자열.한국이그리울땐서버에접속하지;

import java.util.Scanner;

public class Main {
    static int N;
    static  String  s;
    static String arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        s=sc.next();
        arr=new String[N];
        int idx=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='*'){
                idx=i;
                break;
            }
        }

        String first=s.substring(0,idx);
        String last=s.substring(idx+1,s.length());


        for(int i=0; i<N; i++){
            arr[i]=sc.next();
            if(arr[i].length()<s.length()-1){
                System.out.println("NE");
                continue;
            }

            String first1=arr[i].substring(0,first.length());
            String last1=arr[i].substring(arr[i].length()-last.length(), arr[i].length());
            if(first.equals(first1) && last.equals(last1)){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }
    }
}
