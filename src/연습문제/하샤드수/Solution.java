package 연습문제.하샤드수;

class Solution {
    public boolean solution(int x) {
        int answer=0;
        int y=x;
        boolean check=true;
        while (x!=0){
            int re=x%10;
            x=x/10;
            answer+=re;
        }
        if(y%answer!=0){
            check=false;
        }
        return check;
    }
}
