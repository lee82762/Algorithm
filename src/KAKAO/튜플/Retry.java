package KAKAO.튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Retry {
    public int[] solution(String s) {
        s=s.replace("},{","/");
        s=s.replace("{","");
        s=s.replace("}","");
        String s1[]=s.split("/");
        ArrayList<Integer>a1=new ArrayList<>();
        Arrays.sort(s1,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else{
                    return 0;
                }

            }
        });


        for(int i=0; i<s1.length; i++){
            String s2[]=s1[i].split(",");

            for(int j=0; j<s2.length; j++){
                if(a1.isEmpty()){
                    a1.add(Integer.parseInt(s2[j]));
                }
                else{
                    if(a1.contains(Integer.parseInt(s2[j]))){
                        continue;
                    }
                    else{
                        a1.add(Integer.parseInt(s2[j]));
                    }
                }
            }
        }
        int answer[]=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;

    }
}