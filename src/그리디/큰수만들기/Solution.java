package 그리디.큰수만들기;

class Solution {
    public String solution(String number, int k) {

        int cnt=number.length()-k;
        StringBuilder sb=new StringBuilder();
        int cn=0;
        int idx=0;
        for(int i=0; i<cnt; i++){
            cn=0;
            for(int j=idx; j<=i+k; j++){
                if(cn<number.charAt(j)-'0'){
                    cn=number.charAt(j)-'0';
                    idx=j+1;
                }
            }
            sb.append(cn);
        }
        return sb.toString();
    }
}
