package 연습문제.문자열만들기;

import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        s=s.toLowerCase();
        String []s1=s.split(" ");
        String s3="";
        ArrayList<String>re=new ArrayList<>();
        for(int i=0; i<s1.length; i++){
            String []s2=s1[i].split("");
            for(int j=0; j<s1[i].length(); j++){
                if(j==0){
                    s2[j]=s2[j].toUpperCase();
                }
                s3+=s2[j];
            }
            re.add(s3);
            s3="";
        }
        String answer="";
        for(int i=0; i<re.size(); i++){
            answer+=re.get(i)+" ";
        }
        if(s.substring(s.length()-1,s.length()).equals(" ")){
            answer+=" ";
        }
        answer=answer.substring(0,answer.length()-1);
        return answer;
    }
}