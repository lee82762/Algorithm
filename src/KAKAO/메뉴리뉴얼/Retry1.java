package KAKAO.메뉴리뉴얼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
class Retry1 {
    static HashMap<String,Integer>map=new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
        for(int i=0; i<course.length; i++) {
            int r=course[i];
            for (int j = 0; j < orders.length; j++) {
                String arr[] = orders[j].split("");
                Arrays.sort(arr);
                boolean visit[]= new boolean[arr.length];

                combination(arr,visit,0,arr.length, r);

            }

        }
        ArrayList<String>anw=new ArrayList<>();
        ArrayList<String>a1=new ArrayList<>(map.keySet());
        Collections.sort(a1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for(int i=0; i<course.length; i++){
            int re=course[i];
            int max=0;
            for(int j=0; j<a1.size(); j++) {
                if (re == a1.get(j).length()) {
                    max = Math.max(max, map.get(a1.get(j)));
                }
            }
            //1. course크기 마다 최댓값을 구한다.
            //2. max는 2이상이여야한다.

            for(int j=0; j<a1.size(); j++){
                if(max== map.get(a1.get(j))&&re == a1.get(j).length()&&max>=2){

                    anw.add(a1.get(j));
                }
            }

        }
        Collections.sort(anw);
        String result[]=new String[anw.size()];

        for(int i=0; i<result.length; i++){
            result[i]=anw.get(i);
        }


        return result;

    }
    //조합 알고리즘
    static void combination(String[] arr, boolean[] visited, int start, int n, int r) {
        //r=0일때 까지
        if (r == 0) {
            String re="";
            for (int i = 0; i < n; i++) {
                if (visited[i]==true) {
                    re+=arr[i];
                }
            }
            map.put(re,map.getOrDefault(re,0)+1);

            return;
        }
        //backtracking방식으로 구현
        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
}