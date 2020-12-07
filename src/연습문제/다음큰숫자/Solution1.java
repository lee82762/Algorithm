package 연습문제.다음큰숫자;

class Solution1 {
    public int solution(int n) {
        //Integer.bitCount는 이진변환후 1의 갯수를 반환하는 메소드 이다.
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
