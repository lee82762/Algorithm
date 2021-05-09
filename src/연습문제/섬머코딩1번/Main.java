package 연습문제.섬머코딩1번;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main{
    public static void main(String args[]) {
        String code="012345";
        String day="20190620";
        String[] data={"price=80 code=987654 time=2019062113","price=90 code=012345 time=2019062014","price=120 code=987654 time=2019062010","price=110 code=012345 time=2019062009","price=95 code=012345 time=2019062111"};
        HashMap<String,Integer>map=new HashMap<>();


        for(int i=0; i<data.length; i++){
            String s1[]=data[i].split(" ");
            String pri=s1[0].substring(6,s1[0].length());
            String cod=s1[1].substring(5,s1[1].length());
            String date=s1[2].substring(5,s1[2].length()-2);
            String date1="";
            if(s1[2].substring(s1[2].length()-2,s1[2].length()-1).equals("0")){
                date1 = s1[2].substring(s1[2].length() - 1, s1[2].length());
            }
            else {
                date1 = s1[2].substring(s1[2].length() - 2, s1[2].length());
            }

            if(code.equals(cod)&&day.equals(date)){
                map.put(pri,Integer.parseInt(date1));
            }

        }
        ArrayList<String>s1=new ArrayList<>(map.keySet());
      
        Collections.sort(s1,(o1, o2) -> map.get(o1).compareTo(map.get(o2)));

        int answer[]=new int[s1.size()];

        for(int i=0; i<answer.length; i++){
            answer[i]=Integer.parseInt(s1.get(i));
        }



    }
}




