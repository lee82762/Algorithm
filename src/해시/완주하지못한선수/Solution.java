package 해시.완주하지못한선수;

import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer="";
        int j=0;


        for(j=0; j<completion.length; j++){
            if(!participant[j].equals(completion[j])){
                return participant[j];


            }
        }


        return participant[j];

    }


}
