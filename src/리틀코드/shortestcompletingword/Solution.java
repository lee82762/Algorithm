package 리틀코드.shortestcompletingword;

import java.util.*;
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        licensePlate=licensePlate.toLowerCase();
        for(int i=0; i<licensePlate.length(); i++){
            char c=licensePlate.charAt(i);
            if(!Character.isDigit(c) && c !=' '){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        ArrayList<Character> tm =new ArrayList<>(map.keySet());
        Collections.sort(tm);
        int min=Integer.MAX_VALUE;
        String answer="";
        for(int i=0; i<words.length; i++){
            String s=words[i];
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int j=0; j<s.length(); j++){
                char c=s.charAt(j);
                if(!Character.isDigit(c) && c !=' '){
                    map1.put(c,map1.getOrDefault(c,0)+1);
                }
            }

            ArrayList<Character> tm1 =new ArrayList<>(map1.keySet());
            Collections.sort(tm1);

            boolean check=true;
            for(int j=0; j<tm.size(); j++){

                if(!tm1.contains(tm.get(j))){
                    check=false;
                    break;
                }
                else{
                    if(map.get(tm.get(j))>map1.get(tm.get(j))){
                        check=false;
                        break;
                    }
                }
            }
            if(check==true){

                if(min>s.length()){
                    min=s.length();
                    answer=s;
                }
            }
        }
        return answer;

    }
}
