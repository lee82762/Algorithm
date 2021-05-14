package 월간코드챌린지.두개이하로다른비트;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0 ; i < numbers.length ; ++i) {
            if(numbers[i]%2 == 0) {
                answer[i] = numbers[i]+1;
                continue;
            }

            int count = 0;
            long num = numbers[i];

            while(num%2!=0) {
                num=(num-1)/2;
                count++;
            }

            num = 2*(num+1);
            count--;


            for(int j = 0 ; j < count ; ++j) {
                num = num*2+1;
            }

            answer[i] = num;
        }
        return answer;
    }
}