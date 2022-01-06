package 연습문제.다음큰숫자;

class Retry {
    public int solution(int n) {
        int cnt=Integer.bitCount(n);

        while (true){
            n++;
            int cnt1=Integer.bitCount(n);
            if(cnt==cnt1){
                break;
            }

        }
        return n;
    }
}
