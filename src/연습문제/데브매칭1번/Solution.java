package 연습문제.데브매칭1번;

import java.util.ArrayList;
class Solution {
    public String solution(String[] registered_list, String new_id) {
        ArrayList<String> s1=new ArrayList<>();
        for(int i=0; i<registered_list.length; i++){
            s1.add(registered_list[i]);
        }
        boolean answer=true;
        while (true) {
            if(s1.contains(new_id)){
                answer=false;
            }
            else{
                break;
            }
            if(answer==false){
                String temp="";
                String temp1="";
                for(int i=0; i<new_id.length(); i++){
                    char c=new_id.charAt(i);
                    if(!Character.isDigit(c)){
                        temp+=c;
                    }
                    else{
                        temp1+=c;
                    }
                }
                int temp2=0;
                if(temp1!=""){
                    temp2 = Integer.parseInt(temp1) + 1;
                }
                else{
                    temp2=1;
                }
                temp1=Integer.toString(temp2);
                new_id=temp+temp1;
            }

        }
        return new_id;
    }
}
