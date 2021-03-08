package 정렬.통계학;

import java.util.*;

public class Main1 {


    static  int T;
    static double dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        dp=new double[T];

        for(int i=0; i<dp.length; i++){
            dp[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0; i<dp.length; i++){
            sum+=dp[i];
        }
        double avg=0.0;
        avg=sum/dp.length;


        System.out.println((int)Math.round(avg));

        Arrays.sort(dp);
        System.out.println((int)dp[(T/2)]);

        HashMap<Double,Integer>map=new HashMap<>();

        for(int i=0; i<dp.length; i++){
            map.put(dp[i],map.getOrDefault(dp[i],0)+1);
        }
        ArrayList<Double>a2=new ArrayList<>(map.keySet());
        Collections.sort(a2,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));


        int cnt=map.get(a2.get(0));
        if(a2.size()==1){
            System.out.println(Math.round(a2.get(0)));
        }
        else{
            if(map.get(a2.get(1))==cnt){
                System.out.println(Math.round(a2.get(1)));
            }
            else{
                System.out.println(Math.round(a2.get(0)));
            }
        }






        System.out.println((int)(dp[dp.length-1]-dp[0]));






    }

}
