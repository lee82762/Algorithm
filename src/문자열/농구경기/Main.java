package 문자열.농구경기;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        HashMap<Character ,Integer>map=new HashMap<>();
        for(int i=0; i<N; i++){
            String s=sc.next();
            char c=s.charAt(0);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Character>a1=new ArrayList<>(map.keySet());
        String answer="";
        for(int i=0; i<a1.size(); i++){
            if(map.get(a1.get(i))>=5){
                answer+=a1.get(i);

            }
        }
        if(answer.equals("")){
            System.out.println("PREDAJA");
        }
        else {
            System.out.println(answer);
        }
    }

}