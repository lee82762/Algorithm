package 정렬.국영수;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static  int N;
    static String grade[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        grade=new String[N][4];
        for(int i=0; i<N; i++){
            String name=sc.next();
            String korea=sc.next();
            String eng=sc.next();
            String math=sc.next();
            grade[i][0]=name;
            grade[i][1]=korea;
            grade[i][2]=eng;
            grade[i][3]=math;
        }

        Arrays.sort(grade, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[1].equals(o2[1])){
                    if(o1[2].equals(o2[2])){
                        if(o1[3].equals(o2[3])){
                            return o1[0].compareTo(o2[0]);
                        }
                        else{
                            return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
                        }
                    }
                    else{
                        return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
                    }
                }
                else{
                    return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
                }
            }
        });

        for(int i=0; i<grade.length; i++){
            System.out.println(grade[i][0]);
        }

    }
}