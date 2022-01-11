package 순열조합.카드놓기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  int N;
    static  int K;
    static boolean visit[];
    static String output[];
    static ArrayList<String> answer=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        String arr[]=new String[N];
        visit=new boolean[N];
        output=new String[K];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.next();
        }
        //System.out.println(Arrays.toString(arr));
        dfs(arr,0);
        System.out.println(answer.size());
    }
    static public void dfs(String arr[],int dept){
        String s="";
        if(dept==K){
            for(int i=0; i<output.length; i++){
                s+=output[i];
            }
            if(!answer.contains(s)){
                answer.add(s);
            }

            return;
        }

        for(int i=0; i<arr.length; i++){
            if(!visit[i]){
                visit[i]=true;
                output[dept]=arr[i];
                dfs(arr,dept+1);
                visit[i]=false;
            }
        }
    }
}
