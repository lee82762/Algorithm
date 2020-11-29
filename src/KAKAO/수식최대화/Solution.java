package KAKAO.수식최대화;

import java.util.ArrayList;
class Solution {
    public long solution(String expression) {
        String s1[]=expression.split("");

        String re2[][]={{"+","-","*"},{"+","*","-"},{"-","+","*"},{"-","*","+"},{"*","-","+"},{"*","+","-"}};
        String an="";
        ArrayList<String>s2=new ArrayList<>();
        for(int i=0; i<expression.length(); i++){
            char c[]=expression.toCharArray();
            if(Character.isDigit(c[i])){
                String s3=String.valueOf(c[i]);
                an+=s3;

            }
            else{
                s2.add(an);
                String s4=String.valueOf(c[i]);
                s2.add(s4);
                an="";

            }
        }
        s2.add(an);



        ArrayList<String>s4=new ArrayList<>();

        long answer=0;


        for(int k=0; k<re2.length; k++) {
            for(int z=0; z<s2.size(); z++){
                s4.add(s2.get(z));
            }

            for (int j = 0; j < re2[0].length; j++) {



                for (int i = 1; i < s4.size() - 1; i++) {

                    if (re2[k][j].equals(s4.get(i))) {
                        if (re2[k][j].equals("*")) {


                            String s3 = Long.toString(Long.parseLong(s4.get(i - 1)) * Long.parseLong(s4.get(i + 1)));
                            s4.set(i, s3);
                            s4.remove(i - 1);
                            s4.remove(i);
                            i=i-1;

                        } else if (re2[k][j].equals("+")) {

                            String s3 = Long.toString(Long.parseLong(s4.get(i - 1)) + Long.parseLong(s4.get(i + 1)));
                            s4.set(i, s3);
                            s4.remove(i - 1);
                            s4.remove(i);
                            i=i-1;

                        } else if (re2[k][j].equals("-")) {

                            String s3 = Long.toString(Long.parseLong(s4.get(i - 1)) - Long.parseLong(s4.get(i + 1)));
                            s4.set(i, s3);
                            s4.remove(i - 1);
                            s4.remove(i);
                            i=i-1;


                        }
                    }

                }
            }
            Long an1=Math.abs(Long.parseLong(s4.get(0)));

            if(answer==0){
                answer=Long.parseLong(s4.get(0));
                answer=Math.abs(answer);
            }
            if(an1>answer){
                answer=an1;
            }
            s4.clear();

        }


        return answer;
    }
}
