package 리틀코드.minimumnumberofarrowstoburstballoons;

import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0) return 0;
        Arrays.sort(points,(o1, o2) -> Integer.compare(o1[1],o2[1]));

        int curend = points[0][1];
        int count = 1;
        for(int[] p : points) {
            if(p[0] > curend) {
                count++;
                curend = p[1];
            }
            else continue;
        }

        return count;
    }
}
