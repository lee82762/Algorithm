package KAKAO.압축3차;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        String []s1=msg.split("");
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<Integer>a1=new ArrayList<>();

        char c='A';
        int i=0;
        for(i=1; i<=26; i++){
            map.put(String.valueOf(c),i);
            c++;
        }

        for(int k=0; k<s1.length; k++){
            if(map.containsKey(s1[k])==true&&k==s1.length-1){

                a1.add(map.get(s1[k]));
                break;
            }
            if(map.containsKey(s1[k])==true&&map.containsKey(s1[k]+s1[k+1])==false){
                String s2=s1[k]+s1[k+1];

                a1.add(map.get(s1[k]));
                map.put(s2,i);
                i++;
            }
            else if(map.containsKey(s1[k])==true&&map.containsKey(s1[k]+s1[k+1])==true){
                s1[k+1]=s1[k]+s1[k+1];
            }

        }


        int []answer=new int[a1.size()];
        for(int j=0; j<a1.size(); j++){
            answer[j]=a1.get(j);
        }

        return answer;
    }
}