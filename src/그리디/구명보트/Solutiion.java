package 그리디.구명보트;

import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);


        int i=0;
        int j;
        int count=0;
        for (j = people.length-1; i<=j; j--) {
            if(people[j]+people[i]>limit)
                count++;
            else{
                count++;
                i++;
            }
            
        }
        return count;
    }
}
