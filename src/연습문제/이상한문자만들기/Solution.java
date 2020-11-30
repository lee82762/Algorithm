package 연습문제.이상한문자만들기;

class Solution {
    public String solution(String s) {
        s=s.toLowerCase();
        int cnt=0; //끝의 공백의 갯수를 세아린다.
        for(int i=s.length()-1; 0<=i; i--){
            if(s.charAt(i)==' '){
                cnt++;
            }
            else{
                break;
            }
        }


        String s1[]=s.split(" ");
        String answer="";
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s1[i].length(); j++){
                char c=s1[i].charAt(j);
                if(j%2==0){
                    answer+=Character.toUpperCase(c);
                }
                else{
                    answer+=c;
                }

            }
            answer+=" ";

        }
        answer=answer.substring(0,answer.length()-1);
         //끝의 공백의 수를 더해준다.
        for(int i=0; i<cnt; i++){
            answer+=" ";
        }
        return answer;
    }
}
