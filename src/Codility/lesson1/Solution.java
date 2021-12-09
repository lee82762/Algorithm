package Codility.lesson1;


import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer>a1=new ArrayList<>();
        String s=Integer.toBinaryString(n);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                a1.add(i);
            }
        }
        int max=0;
        for(int i=1; i<a1.size(); i++){
            int a=(a1.get(i)-a1.get(i-1))-1;
            max=Math.max(max,a);
        }
        return max;
    }
}
