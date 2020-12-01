package 연습문제.제일작은수제거하기;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int min=arr[0];
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=min){
                arr1.add(arr[i]);
            }
        }
        if(arr1.isEmpty()){
            arr1.add(-1);
        }
        int []answer=new int[arr1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arr1.get(i);
        }
        return answer;
    }
}
