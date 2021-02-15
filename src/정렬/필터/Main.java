package 정렬.필터;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int R;
    static int C;
    static int T;
    static int [][]map;
    static int [][]map1;
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        R=sc.nextInt();
        C=sc.nextInt();

        map=new int[R][C];
        map1=new int[R-2][C-2];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                map[i][j]=sc.nextInt();
            }
        }
        T=sc.nextInt();

        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=0; i<R-2; i++){
            for(int j=0; j<C-2; j++){

                for(int k=i; k<i+3; k++){
                    for(int h=j; h<j+3; h++){
                        a1.add(map[k][h]);
                    }
                }
                Collections.sort(a1);
                map1[i][j]=a1.get(4);
                a1.clear();

            }
        }
        int answer=0;
        for(int i=0; i<R-2; i++){
            for(int j=0; j<C-2; j++){
                if(T<=map1[i][j]){
                    answer++;
                }
            }
        }
        System.out.println(answer);





    }
}
