package 비트마스킹.집합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        ArrayList<Integer>s1=new ArrayList<>();
        StringBuilder result=new StringBuilder();
        for(int i=0; i<X+1; i++){
            String s=sc.nextLine();
            String s2[]=s.split(" ");
            if(s2[0].equals("add")){
                s1.add(Integer.parseInt(s2[1]));
            }
            else if(s2[0].equals("remove")){
                s1.removeAll(Arrays.asList(Integer.valueOf(Integer.parseInt(s2[1]))));
            }
            else if(s2[0].equals("check")){
                if(s1.contains(Integer.parseInt(s2[1]))){
                    result.append("1\n");
                }
                else{
                    result.append("0\n");
                }
            }
            else if(s2[0].equals("all")){
                s1.clear();
                for(int j=1; j<=20; j++) {
                    s1.add(j);
                }
            }
            else if(s2[0].equals("toggle")){
                if(s1.contains(Integer.parseInt(s2[1]))){
                    s1.removeAll(Arrays.asList(Integer.valueOf(Integer.parseInt(s2[1]))));
                }
                else{
                    s1.add(Integer.parseInt(s2[1]));
                }
            }
            else if(s2[0].equals("empty")){
                s1.clear();
            }

        }
        System.out.println(result);


    }

}
