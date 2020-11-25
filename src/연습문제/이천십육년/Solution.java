package 연습문제.이천십육년;

class Solution {
    public String solution(int a, int b) {
        String w[] = {"THU","FRI","SAT", "SUN", "MON", "TUE", "WED"};
        int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        int total=0;
        for(int i=0; i<a-1; i++){
            total+=m[i];
        }
        total+=b;
        String answer="";
        answer=w[total%7];

        return answer;
    }
}