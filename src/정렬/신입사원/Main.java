package 정렬.신입사원;

import java.util.*;

public class Main {
    static  class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Pair o) {
            if(this.x > o.x) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int j=0; j<N; j++){
            int M=sc.nextInt();
            ArrayList<Pair>re=new ArrayList<>();
            for(int i=0; i<M; i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                re.add(new Pair(a,b));
            }
            Collections.sort(re);

            int answer=1;
            int min=re.get(0).y;

            for(int i=1; i<M; i++){
                if(re.get(i).y<min){
                    answer++;
                    min=re.get(i).y;
                }
            }
            System.out.println(answer);
        }
    }
}
