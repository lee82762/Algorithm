package 순열조합.카드놓기;

import java.util.ArrayList;
import java.util.Scanner;

public class Retry {
    static boolean []visit;
    static String outpiut[];
    static ArrayList<String>s1=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }
        visit=new boolean[n];
        outpiut=new String[n];

        dfs(k,0,arr);
        System.out.println(s1.size());
    }
    static public void dfs(int r,int dept,String []arr){
        String answer="";
        if(dept==r){
            for(int i=0; i<r; i++){
                answer+=outpiut[i];
            }
            if(!s1.contains(answer)){
                s1.add(answer);
            }

            return;
        }

        for(int i=0; i<arr.length; i++){
            if(visit[i]==false){
                outpiut[dept]=arr[i];
                visit[i]=true;
                dfs(r,dept+1,arr);
                visit[i]=false;
            }
        }
    }
}
