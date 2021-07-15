package ICT.사번;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Result {
    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
        int [][]time=new int[arrival.size()][2];

        for(int i=0; i<time.length; i++){
            time[i][0]=arrival.get(i);
            time[i][1]=arrival.get(i)+duration.get(i);
        }



        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) {
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

        int cnt=0;
        int pre=0;

        for(int i=0; i<time.length; i++){
            if(pre<=time[i][0]){
                pre=time[i][1];
                cnt++;
            }
        }
        return cnt;

    }

}

