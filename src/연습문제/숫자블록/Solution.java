package 연습문제.숫자블록;

class Solution {
    static int max = 10000000;
    public int[] solution(long begin, long end) {
        int range = (int) (end - begin);
        int answer[] = new int[range+1];
        int count = 0;
        for (long i = begin; i <= end; i++) {
            if(i==1) {
                count++;
                continue;
            }
            int temp = findMinority((int)i);
            if(i == temp){
                answer[count] = 1;
            } else {
                answer[count] = (int) temp;
            }
            count++;
        }
        return answer;
    }
    static public int findMinority(int num){
        if(num==1){ return 0; }

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0&&(num/i)<=max){
                return num/i;
            }
        }
        return 1;
    }
}
