package KAKAO.수식최대화;

import java.util.ArrayList;
class Last {
    public long solution(String expression) {

        String calc[]={"*-+","*+-","+*-","+-*","-*+","-+*"};
        String exp[]=expression.split("");
        ArrayList<String>exp2=new ArrayList<>();
        String s="";
        for(int i=0; i<exp.length; i++){
            char c=expression.charAt(i);
            if(i==exp.length-1){
                exp2.add(s+c);
            }
            if(Character.isDigit(c)){
                s+=c;
            }
            else{
                exp2.add(s);
                exp2.add(String.valueOf(c));
                s="";
            }
        }
        long answer=0;

        for(int i=0; i<calc.length; i++){
            int cnt=0;
            ArrayList<String>exp1=(ArrayList<String>)exp2.clone();
            String calcs[]=calc[i].split("");
            for(int j=0; j<calcs.length; j++){
                String cal=calcs[j];
                for(int k=1; k<exp1.size()-1; k++){
                    if(cal.equals(exp1.get(k))){
                        if(cal.equals("*")){
                            long a=Long.parseLong(exp1.get(k-1))*Long.parseLong(exp1.get(k+1));
                            exp1.set(k,Long.toString(a));
                            exp1.remove(k-1);
                            exp1.remove(k);
                            k=k-1;
                        }
                        else if(cal.equals("+")){
                            long a=Long.parseLong(exp1.get(k-1))+Long.parseLong(exp1.get(k+1));
                            exp1.set(k,Long.toString(a));
                            exp1.remove(k-1);
                            exp1.remove(k);
                            k=k-1;
                        }
                        else if(cal.equals("-")){
                            long a=Long.parseLong(exp1.get(k-1))-Long.parseLong(exp1.get(k+1));
                            exp1.set(k,Long.toString(a));
                            exp1.remove(k-1);
                            exp1.remove(k);
                            k=k-1;
                        }
                    }
                }
            }
            answer=Math.max(answer,Math.abs(Long.parseLong(exp1.get(0))));

        }


        return answer;
    }
}
