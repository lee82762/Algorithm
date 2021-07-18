package KAKAO.수식최대화;

import java.util.ArrayList;
class Retry {
    public long solution(String expression) {

        String re2[][]={{"+","-","*"},{"+","*","-"},{"-","+","*"},{"-","*","+"},{"*","-","+"},{"*","+","-"}};
        String an="";
        ArrayList<String> s2=new ArrayList<>();
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
        long answer=0;

        ArrayList<String>s4=new ArrayList<>();
        for(int i=0; i<re2.length; i++){
            for(int j=0; j<s2.size(); j++){
                s4.add(s2.get(j));
            }

            for(int k=0; k<re2[0].length; k++){

                for(int z=1; z<s4.size()-1; z++){
                    if(re2[i][k].equals(s4.get(z))){
                        if(re2[i][k].equals("*")){
                            String s3=Long.toString(Long.parseLong(s4.get(z-1))*Long.parseLong(s4.get(z+1)));
                            s4.set(z,s3);
                            s4.remove(z-1);
                            s4.remove(z);
                            z=z-1;
                        }
                        else if(re2[i][k].equals("+")){
                            String s3=Long.toString(Long.parseLong(s4.get(z-1))+Long.parseLong(s4.get(z+1)));
                            s4.set(z,s3);
                            s4.remove(z-1);
                            s4.remove(z);
                            z=z-1;
                        }
                        else if(re2[i][k].equals("-")){
                            String s3=Long.toString(Long.parseLong(s4.get(z-1))-Long.parseLong(s4.get(z+1)));
                            s4.set(z,s3);
                            s4.remove(z-1);
                            s4.remove(z);
                            z=z-1;
                        }
                    }
                }

            }
            Long a=Math.abs(Long.parseLong(s4.get(0)));
            answer=Math.max(a,answer);

            s4.clear();
        }

        return answer;
    }
}
