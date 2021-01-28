package KAKAO.신규아이디추천;

//c[i]>='0'&&c[i]<='9' 을  c[i]>='1'&&c[i]<='9'로하는 어이없는 실수는 하지말자!!

class Solution {
    public String solution(String new_id) {
        if(new_id==null){
            return " ";
        }
        new_id=new_id.toLowerCase();
        String answer1="";
        String answer="";

        for(int i=0; i<new_id.length(); i++){
            char c[]=new_id.toCharArray();
            if(c[i]=='-'|| c[i]=='_'||c[i]=='.'||c[i]>='a'&&c[i]<='z'||c[i]>='0'&&c[i]<='9'){
                answer1+=c[i];
            }
        }
        for(int i=0; i<answer1.length(); i++){
            char c[]=answer1.toCharArray();
            if(i!=answer1.length()-1){
                if(c[i]=='.'&&c[i+1]=='.'){

                }
                else if(c[i]=='.'&&c[i+1]!='.'){
                    answer+=c[i];
                }
                else{
                    answer+=c[i];
                }

            }
            else{
                answer+=c[i];
            }
        }
        System.out.println(answer);
        if(answer.length()==0){

        }
        else{
            String first=answer.substring(0,1);
            String last=answer.substring(answer.length()-1,answer.length());
            if(first.equals(".")){
                answer=answer.substring(1,answer.length());
            }
            if(last.equals(".")){
                if(answer.length()==0){

                }
                else {
                    answer = answer.substring(0, answer.length() - 1);
                }
            }

        }
        if(answer.length()==0){
            answer="a";
        }

        if(answer.length()>=16){
            answer=answer.substring(0,15);
            String last1=answer.substring(answer.length()-1,answer.length());
            if(last1.equals(".")){
                answer=answer.substring(0,answer.length()-1);
            }

        }

        String last2=answer.substring(answer.length()-1,answer.length());
        if(answer.length()<=2){
            while (true){
                answer+=last2;
                if(answer.length()==3){
                    break;
                }
            }

        }
        return answer;
    }
}