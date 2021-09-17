package 리틀코드.secondlargestdigitinastring;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int secondHighest(String s) {
        ArrayList<Character> c1=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                if(!c1.contains(c)){
                    c1.add(c);
                }
            }
        }
        Collections.sort(c1,Collections.reverseOrder());
        if(c1.size()==0){
            return -1;
        }
        if(c1.size()!=1){
            return Integer.parseInt(String.valueOf(c1.get(1)));
        }

        else{
            return -1;
        }

    }
}
