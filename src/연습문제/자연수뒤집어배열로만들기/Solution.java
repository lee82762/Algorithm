package 연습문제.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {


        String s=Long.toString(n);
        int answer[]=new int[s.length()];
        int cnt=0;
        while (n>0){
            answer[cnt++]= (int) (n%10);
            n=n/10;
        }

        return answer;
    }
}