package 정렬.단어정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static  int N;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        ArrayList<String>st=new ArrayList<>();
        for(int i=0; i<N; i++){
            String s=sc.next();
            if(!st.contains(s)){
                st.add(s);
            }
        }
        //길이 순으로 정렬
        Collections.sort(st,(o1, o2) -> Integer.toString(o1.length()).compareTo(Integer.toString(o2.length())));
        //길이가 같으면 사전순으로 정렬
        Collections.sort(st, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o1.length()-o2.length();
                }
                else{
                    return o1.compareTo(o2);
                }
            }
        });



        for(int i=0; i<st.size(); i++){
            System.out.println(st.get(i));

        }





    }
}