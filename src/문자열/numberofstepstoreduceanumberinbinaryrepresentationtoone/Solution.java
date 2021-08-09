package 문자열.numberofstepstoreduceanumberinbinaryrepresentationtoone;

import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger n=new BigInteger(s,2);
        int answer=0;
        while (n.intValue()!=1){
            if(n.mod(BigInteger.valueOf(2)).intValue()==0){
                n=n.divide(BigInteger.valueOf(2));
            }
            else{
                n=n.add(BigInteger.valueOf(1));
            }
            answer++;
        }
        return answer;
    }
}
