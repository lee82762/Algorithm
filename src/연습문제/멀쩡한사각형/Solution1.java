package 연습문제.멀쩡한사각형;

class Solution1 {
    public long solution(int w, int h) {

        long answer = 0;
        for(int i = 1; i < w; i++) {
            answer += (long)Math.floor((double)h*i/w);
        }
        return answer * 2;

    }
}