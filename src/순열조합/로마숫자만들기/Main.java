package 순열조합.로마숫자만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static ArrayList<Integer>a1=new ArrayList<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        String[]arr={"1","5","10","50"};
        String []out=new String[N];
        dfs(arr,out,0,N,0);
        System.out.println(a1.size());



    }
    static public void dfs(String []arr,String []out,int dept, int r,int start){
        int answer=0;
        if(dept==r){
            for(String a: out){
                answer+=Integer.parseInt(a);
            }
            if(!a1.contains(answer)){
                a1.add(answer);
            }
            return;
        }
        for(int i=start; i<arr.length; i++){
            out[dept]=arr[i];
            dfs(arr,out,dept+1,r,i);
        }

    }
}
