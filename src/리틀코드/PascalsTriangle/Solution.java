package 리틀코드.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int map[][]=new int[rowIndex+1][rowIndex+1];
        map[0][0]=1;
        for(int i=1; i<map.length; i++){
            for(int j=0; j<map.length; j++){
                if(j==0) {
                    map[i][j] = 1;
                }
                else if(i==j){
                    map[i][j]=1;
                }
                else{
                    map[i][j]=map[i-1][j-1]+map[i-1][j];
                }
            }

        }
        List<Integer>a1=new ArrayList<>();

        for(int i=0; i<map.length; i++){
            a1.add(map[map.length-1][i]);
        }
        return a1;

    }
}
