package 연습문제.최대공약수최소공배수;

class Solution {

    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
    public int[] solution(int a, int b) {
        int []answer=new int[2];
        int a1=gcd(a,b);
        int a2=lcm(a,b);
        answer[0]=a1;
        answer[1]=a2;



        return answer;
    }
}