package 연습문제.숫자나라124;

class Solution {
    public String solution(int n) {
        String[]an={"4","1","2"};

        String answer="";
        while (n!=0){
            int re=n%3;
            n=n/3;
            if(re==0){
                n--;
            }
            answer=an[re]+answer;
        }
        return answer;
    }
}