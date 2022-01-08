package KAKAO.순위검색;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
class Retry1 {
    static HashMap<String, ArrayList<Integer>>map = new HashMap<>();
    public int[] solution(String[] info, String[] query) {
        int answer[]=new int[query.length];
        for(int i=0; i<info.length; i++){
            String p[]=info[i].split(" ");
            dfs(p,0,"");
        }

        for(String key:map.keySet()){
            Collections.sort(map.get(key));
        }

        for(int i=0; i<query.length; i++) {
            String temp[] = query[i].replace(" and ", "").split(" ");
            int score = Integer.parseInt(temp[1]);
            answer[i] = binarySearch(temp[0], score);

        }
        return answer;
    }
    static int binarySearch(String string, int score) {
        if(map.containsKey(string)) {
            List<Integer> list = map.get(string);
            int left = 0;
            int right = list.size()-1;
            if(list.get(right) < score) {
                return 0;
            }

            while(left<right) {
                int mid = (left+right)/2;
                if(list.get(mid) < score) {
                    left = mid+1;
                }
                else{
                    right = mid;
                }
            }
            return list.size() - left;
        }
        return 0;
    }
    static public void dfs(String []info,int dept,String str){
        if(dept==4){
            if(!map.containsKey(str)){
                ArrayList<Integer> list=new ArrayList<>();
                map.put(str,list);
            }
            map.get(str).add(Integer.parseInt(info[4]));
            return;
        }
        dfs(info,dept+1,str+"-");
        dfs(info,dept+1,str+info[dept]);

    }
}
