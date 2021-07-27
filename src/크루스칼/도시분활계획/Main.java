package 크루스칼.도시분활계획;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int re[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        ArrayList<int []>a1=new ArrayList<>();
        re=new int[N];
        for(int i=0; i<N; i++){
            re[i]=i;
        }

        int an[][]=new int[M][3];
        for(int i=0; i<M; i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            int c=sc.nextInt();
            an[i][0]=a;
            an[i][1]=b;
            an[i][2]=c;
        }

        for(int a[]:an){
            a1.add(a);
        }


        Collections.sort(a1,(o1, o2) -> o1[2]-o2[2]);

        int answer=0;
        int max=0;
        for(int i=0; i<a1.size(); i++){

            if(find(a1.get(i)[0])!=find(a1.get(i)[1])){
                union(a1.get(i)[0],a1.get(i)[1]);
                answer+=a1.get(i)[2];
                max=a1.get(i)[2];
            }
        }
        System.out.println(answer-max);

    }
    public static void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a>b){
            re[a]=b;
        }
        else{
            re[b]=a;
        }
    }

    public static int find(int x){
        if(re[x]==x){
            return x;
        }
        else{
            return find(re[x]);
        }
    }

}
