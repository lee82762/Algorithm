package 완전탐색.모의고사;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answer) {

        int []a1={1,2,3,4,5};
        int []a2={2,1,2,3,2,4,2,5};
        int []a3={3,3,1,1,2,2,4,4,5,5};
        int []result=new int[3];
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0; i<answer.length; i++) {
            if (answer[i] == a1[i % 5]) {
                result[0]++;
            }
            if (answer[i] == a2[i % 8]) {
                result[1]++;
            }
            if (answer[i] == a3[i % 10]) {
                result[2]++;
            }
        }

        
        int max=0;
        for(int i=0; i<result.length; i++){
            max=Math.max(max,result[i]);
        }


        for(int i=0; i<result.length; i++){
            if(max==result[i]){
                ans.add(i+1);
            }
            else{
                continue;
            }

        }
        int result1[]=new int[ans.size()];
        for(int i=0; i<result1.length; i++){
            result1[i]=ans.get(i);
        }
        return result1;
    }
}