package 그리디.단속카메라;

import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        ArrayList<int []>list=new ArrayList<>();
        for(int rout[]:routes){
            list.add(rout);
        }
        Collections.sort(list,(o1, o2) -> o1[1]-o2[1]);

        int answer=0;
        while (!list.isEmpty()){
            int temp=list.get(0)[1];

            for(int i=0; i< list.size(); i++){
                if(list.get(i)[0]<=temp){
                    list.remove(i);
                    i--;
                }
            }
            answer++;
        }
        return answer;
    }
}
