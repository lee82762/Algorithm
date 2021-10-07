package 리틀코드.relativesortarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int answer[]=new int[arr1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        ArrayList<Integer>a1=new ArrayList<>(map.keySet());
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            int tm=arr1[i];
            boolean visit=true;
            for(int j=0; j<arr2.length; j++){
                if(tm==arr2[j]){
                    visit=false;
                    break;
                }
            }
            if(visit==true){
                a2.add(tm);
            }
        }

        System.out.println(a2);
        Collections.sort(a2);

        int cnt1=0;
        for(int i=0; i<arr2.length; i++){
            int tm=arr2[i];
            int cnt=map.get(tm);
            for(int j=cnt1;  j<cnt1+cnt; j++){
                answer[j]=tm;
            }
            cnt1+=cnt;
        }
        int tm1=0;
        for(int i=cnt1; i<arr1.length; i++){
            answer[i]=a2.get(tm1++);

        }
        return answer;
    }
}
