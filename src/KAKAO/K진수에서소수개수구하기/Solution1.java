package KAKAO.K진수에서소수개수구하기;

import java.util.*;
class Solution1 {
    static ArrayList<Long> tem=new ArrayList<>();
    public int solution(int n, int k) {
        String s=Integer.toString(n,k);
        String temp="";
        int answer=0;

        if(!s.contains("0")){
            if(check(s)){
                return 1;
            }
            else{
                return 0;
            }
        }

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='0'){
                if(check(temp)) {
                    tem.add(Long.parseLong(temp));
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
        long n=Long.parseLong(s);
        if(n <= 1) return false;
        else if(n == 2) return true;

        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
}
