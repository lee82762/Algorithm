package 해시.위장;

import java.util.ArrayList;
import java.util.HashMap;
class Retry {
    public int solution(String[][] clothes) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }

        ArrayList<String>keys=new ArrayList<>(map.keySet());
        int answer=1;
        for(int i=0; i<keys.size(); i++){
            int tm=map.get(keys.get(i));
            answer+=tm*answer;
        }

        return answer-1;
    }
}
