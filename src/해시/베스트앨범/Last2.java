package 해시.베스트앨범;

import java.util.*;
class Last2 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        ArrayList<String> s1 = new ArrayList<>(map.keySet());
        Collections.sort(s1, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        boolean visit[] = new boolean[genres.length];
        ArrayList<Integer> re = new ArrayList<>();
        for (int i = 0; i < s1.size(); i++) {
            String s = s1.get(i);
            int first = 0;
            int first_id = -1;
            int second = 0;
            int last_id = -1;
            for (int j = 0; j < genres.length; j++) {
                if (s.equals(genres[j])) {
                    if (first < plays[j]) {
                        first = plays[j];
                        first_id = j;
                    }
                }
            }

            for (int j = 0; j < genres.length; j++) {
                if (s.equals(genres[j]) && j != first_id){
                    if(second<plays[j]){
                        second = plays[j];
                        last_id = j;
                    }
                }
            }
            if(first_id!= -1){
                re.add(first_id);
            }
            if(last_id!= -1){
                re.add(last_id);
            }
        }
        int answer[] = new int[re.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = re.get(i);
        }
        return answer;
    }
}
