package 리틀코드.nrepeatedelementinsize2narray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int repeatedNTimes(int[] nums) {
        Scanner sc = new Scanner(System.in);

        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer> a1 =new ArrayList<>(map.keySet());
        int answer=0;
        for(int i=0; i<a1.size(); i++){
            if(map.get(a1.get(i))==n){
                answer=a1.get(i);
            }
        }
        return answer;

    }
}
