package KAKAO.K진수에서소수개수구하기;

class Solution {
    public int solution(int n, int k) {

        String s=Long.toString(n,k);
        String temp="";
        int answer=0;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='0'){
                if(check(temp)) {
                    answer++;
                }
                temp="";
            }
            temp+=c;
        }

        if(check(temp)) {
            answer++;
        }
        return answer;
    }
    static public boolean check(String s){
        long tm=Long.parseLong(s);


        int cnt=0;
        for(long i=1; i<=tm; i++){
            if(tm%i==0){
                cnt++;
            }
            if(cnt>2){
                return false;
            }
        }

        if(cnt==2){
            return true;
        }
        return false;
    }
}
