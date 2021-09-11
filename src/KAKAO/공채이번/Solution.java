package KAKAO.공채이번;

class Solution {
    public int solution(int n, int k) {
        String ans="";
        while (n>0){
            ans=(n%k)+ans;
            n/=k;
        }

        int answer=0;


        String ans1[]=ans.split("");

        String tm1="";
        for(int i=0; i<ans1.length; i++){
            if(!ans1[i].equals("0")){
                tm1+=ans1[i];
            }
            else {

                if(!tm1.equals("")) {
                    if (check(Long.parseLong(tm1))) {
                        answer++;
                    }
                    tm1="";
                }
                else {
                    tm1 = "";
                }
            }
        }


        if(!tm1.equals("")) {
            if (check(Long.parseLong(tm1))) {
                answer++;
            }
        }
        return answer;
    }
    static boolean check(long n){
        if ( n == 1 )
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
