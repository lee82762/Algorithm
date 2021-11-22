package 그리디.단속카메라;

import java.util.*;
class Retry {
    public int solution(int[][] routes) {
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int answer=0;

        int temp=-30000;
        for(int i=0; i<routes.length; i++){
            if(temp<routes[i][0]){
                answer++;
                temp=routes[i][1];
            }

        }
        return answer;
    }
}
