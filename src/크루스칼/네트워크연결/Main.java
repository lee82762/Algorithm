package 크루스칼.네트워크연결;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int re[];
    static int answer=0;
    static int map[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        map=new int[M][3];
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            map[i][0]=a;
            map[i][1]=b;
            map[i][2]=c;
        }
        re=new int[N+1];
        for(int i=1; i<=N; i++){
            re[i]=i;
        }
        ArrayList<int[]>a1=new ArrayList<>();
        for(int []a:map){
            a1.add(a);
        }
        Collections.sort(a1,(o1, o2) -> o1[2]-o2[2]);
        for(int i=0; i<a1.size(); i++){
            if(find(a1.get(i)[0])!=find(a1.get(i)[1])){
                union(a1.get(i)[0],a1.get(i)[1]);
                answer+=a1.get(i)[2];
                continue;
            }
        }
        System.out.println(answer);



    }
    private static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a>b){
            re[a]=b;
        }
        else{
            re[b]=a;
        }
    }

    private static int find(int x){
        if(re[x]==x){
            return x;
        }
        else{
            return find(re[x]);
        }
    }
}
