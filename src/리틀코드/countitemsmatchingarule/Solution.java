package 리틀코드.countitemsmatchingarule;

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int answer=0;
        int temp=0;
        if(ruleKey.equals("type")){
            temp=0;
        }
        else if(ruleKey.equals("color")){
            temp=1;
        }
        else{
            temp=2;
        }
        for(int i=0; i<items.size(); i++){
            if(items.get(i).get(temp).equals(ruleValue)){
                answer++;
            }
        }
        return answer;


    }
}
