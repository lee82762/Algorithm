package 리틀코드.addbinary;

import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger biga = new BigInteger(a, 2);
        BigInteger bigb = new BigInteger(b, 2);
        String answer = biga.add(bigb).toString(2);
        return answer;
    }
}