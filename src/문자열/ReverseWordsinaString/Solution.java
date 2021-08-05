package 문자열.ReverseWordsinaString;

import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> s1=new ArrayList<>();


        String s2[]=s.split("");
        String temp="";
        if(!s2[0].equals(" ")){
            temp+=s2[0];
        }

        for(int i=1; i<s2.length; i++){

            if(!s2[i].equals(" ")&&s2[i-1].equals(" ")){
                temp+=s2[i];

            }
            else if(s2[i].equals(" ")&&s2[i-1].equals(" ")){
                continue;
            }
            else{
                temp+=s2[i];
            }
        }
        String answer="";
        String s3[]=temp.split(" ");
        for(int i=s3.length-1; i>=0; i--){
            if(i==0){
                answer+=s3[i];
            }
            else {
                answer += s3[i] + " ";
            }

        }
        return answer;
    }
}
