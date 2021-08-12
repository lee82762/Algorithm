package 문자열.maskingpersonalinformation;

class Solution {
    public String maskPII(String s) {
        s=s.toLowerCase();
        String answer="";
        if(s.contains("@")){
            String s1[]=s.split("@");
            s1[0]=s1[0].substring(0,1)+"*****"+s1[0].substring(s1[0].length()-1,s1[0].length());
            answer=s1[0]+"@"+s1[1];

        }
        else{
            s=s.replace("(","");
            s=s.replace(")","");
            s=s.replace("-","");
            s=s.replace("+","");
            s=s.replace(" ","");

            if(s.length()==10){
                answer="***-***-"+s.substring(s.length()-4,s.length());
            }
            else if(s.length()==11){
                answer="+*-***-***-"+s.substring(s.length()-4,s.length());
            }
            else if(s.length()==12){
                answer="+**-***-***-"+s.substring(s.length()-4,s.length());
            }
            else{
                answer="+***-***-***-"+s.substring(s.length()-4,s.length());
            }
        }
        return answer;
    }
}
