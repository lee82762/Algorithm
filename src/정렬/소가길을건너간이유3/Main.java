package 정렬.소가길을건너간이유3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static class Cow implements Comparable<Cow>{
        int start, time;

        public Cow(int start, int time) {
            this.start = start;
            this.time = time;
        }

        @Override
        public int compareTo(Cow o) {
            if(this.start != o.start) return this.start-o.start;
            return this.time - o.time;
        }

    }
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        Cow c[]=new Cow[N];
        int cnt=0;
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            c[i]=new Cow(a,b);
        }
        Arrays.sort(c);
        for(int i = 0; i < N; i++) {
            Cow cur = c[i];
            if(cur.start > cnt) cnt = cur.start + cur.time;
            else cnt += cur.time;
        }
        System.out.println(cnt);

    }
}
