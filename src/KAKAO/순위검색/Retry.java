package KAKAO.순위검색;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class Retry {
    static HashMap<String, ArrayList<Integer>>map;
    public int[] solution(String[] info, String[] query) {

        map = new HashMap<>();
        for(String in:info){
            String arr[]=in.split(" ");
            combin("",0,arr);
        }
        int queryIdx = 0;
        int[] answer = new int[query.length];
        ArrayList<String>list=new ArrayList<>(map.keySet());
        for(int i=0; i<list.size(); i++){
            ArrayList<Integer>tm=map.get(list.get(i));
            Collections.sort(tm);
        }
        for(String s:query){
            String str = s.replace(" and ","");
            String tmp[]=str.split(" ");

            answer[queryIdx++] = binarySearch(tmp[0],Integer.parseInt(tmp[1]));
        }
        return answer;
    }
    static public void combin(String str,int dept,String []arr){
        if(dept==4){
            int score=Integer.parseInt(arr[4]);
            if(map.containsKey(str)) map.get(str).add(score);
            else{
                ArrayList<Integer>tm=new ArrayList<>();
                tm.add(score);
                map.put(str,tm);
            }
            return;
        }
        combin(str+"-",dept+1,arr);
        combin(str + arr[dept],dept+1,arr);
    }
    static int binarySearch(String query, int score)
    {
        if(!map.containsKey(query)) return 0;
        ArrayList<Integer> tmpList = map.get(query);
        int start = 0, end = tmpList.size()-1;
        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(score > tmpList.get(mid)) start = mid + 1;
            else end = mid - 1;
        }
        return tmpList.size() - start;
    }
}
