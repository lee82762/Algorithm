package 그리디.구명보트;

import java.util.Arrays;

class Retry1 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int j=0;
        int answer=0;
        for(int i=people.length-1; i>=0; i--){

            if(i<j){
                break;
            }

            if(people[i]+people[j]>limit){
                answer++;
            }
            else{
                j++;
                answer++;
            }

        }
        return answer;
    }
}