package 문자열.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> map=new ArrayList<>();

        for(int i=0; i<numRows; i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for (int j=0; j<=i; j++){

                if(j==0){
                    temp.add(1);
                }
                else if(i==j){
                    temp.add(1);
                }
                else{
                    temp.add(map.get(i-1).get(j)+map.get(i-1).get(j-1));
                }
            }
            map.add(temp);
        }
        return map;

    }
}
