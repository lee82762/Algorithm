package 연습문제.오늘도졌다;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int oui[]=new int[9];
        int star[]=new int[9];

        for(int i=0; i<9; i++){
            oui[i]=sc.nextInt();
        }

        for(int i=0; i<9; i++){
            star[i]=sc.nextInt();
        }

        int sum=0;
        int sum1=0;
        for(int i=0; i<9; i++){
            int outst=oui[i];
            int starst=star[i];

            sum+=outst;
            if(sum>sum1){
                System.out.println("Yes");
                return;
            }
            sum1+=starst;
        }
        System.out.println("No");



    }
}
