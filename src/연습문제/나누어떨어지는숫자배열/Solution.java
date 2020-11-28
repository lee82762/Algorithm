package 연습문제.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                arr1.add(arr[i]);
            }
        }
        if(arr1.isEmpty()){
            arr1.add(-1);
        }
        Collections.sort(arr1);

        int []answer=new int[arr1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arr1.get(i);
        }

        return answer;
    }
}