package 해시.수강신청;

import java.util.*;

public class Main {
    static int N;
    static int K;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        String a[]=new String[K];
        for(int i=0; i<K; i++){
            a[i]=sc.next();
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++){
            map.put(a[i],i);
        }
        ArrayList<String> a1= new ArrayList<>(map.keySet());
        Collections.sort(a1, (o1, o2) -> map.get(o1).compareTo(map.get(o2)));

        for(int i=0; i<a1.size(); i++){
            System.out.println(a1.get(i));
            if(i==N-1){
                break;
            }
        }

    }
}
