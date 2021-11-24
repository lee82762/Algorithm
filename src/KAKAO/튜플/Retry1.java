package KAKAO.튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Retry1 {
    public int[] solution(String s) {
        s=s.replace("{{","");
        s=s.replace("}}","");
        s=s.replace("},{"," ");
        String s1[]=s.split(" ");
        Arrays.sort(s1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        ArrayList<String>a1=new ArrayList<>();
        for(int i=0; i<s1.length; i++){
            String s2[]=s1[i].split(",");
            for(int j=0; j<s2.length; j++){
                if(a1.isEmpty()){
                    a1.add(s2[j]);
                }
                else{
                    if(!a1.contains(s2[j])){
                        a1.add(s2[j]);
                    }
                }
            }
        }
        int answer[]=new int[a1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=Integer.parseInt(a1.get(i));
        }
        return answer;

    }
}
