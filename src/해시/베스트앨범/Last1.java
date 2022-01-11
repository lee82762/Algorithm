package 해시.베스트앨범;

import java.util.*;
class Last1 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer> map =new HashMap<>();

        for(int i=0; i<genres.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }

        ArrayList<String> s1 =new ArrayList<>(map.keySet());
        Collections.sort(s1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0; i<s1.size(); i++){
            String gen = s1.get(i);
            boolean check[]=new boolean[genres.length];
            int max=0;
            int idx=-1;
            for(int j=0; j<genres.length; j++){
                if(genres[j].equals(gen)){
                    if(plays[j]>max){
                        max=plays[j];
                        idx=j;
                    }
                }
            }
            check[idx]=true;
            max=0;
            int idx1=-1;

            for(int j=0; j<genres.length; j++){
                if(genres[j].equals(gen) && !check[j]){
                    if(plays[j]>max){
                        max=plays[j];
                        idx1=j;
                    }
                }
            }
            if(idx1==-1){
                ans.add(idx);
            }
            else{
                ans.add(idx);
                ans.add(idx1);
            }

        }
        int answer[]=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}
