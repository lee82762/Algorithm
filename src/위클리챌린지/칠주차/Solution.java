package 위클리챌린지.칠주차;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] enter, int[] leave) {
        int []answer=new int[enter.length+1];
        ArrayList<Integer>a1=new ArrayList<>();
        int en=0;
        int li=0;
        while (en<enter.length||li<leave.length){
            if(!a1.contains(leave[li])){
                a1.add(enter[en]);
                en++;
            }
            else{
                for(int i=0; i<a1.size(); i++){
                    if(a1.get(i)!=leave[li]) {
                        answer[a1.get(i)]++;
                    }
                }
                a1.remove(Integer.valueOf(leave[li]));
                answer[leave[li]]+=a1.size();
                li++;


            }
        }
        int result[]=new int[enter.length];
        for(int i=0; i<result.length; i++){
            result[i]=answer[i+1];
        }
        return result;
    }
}
