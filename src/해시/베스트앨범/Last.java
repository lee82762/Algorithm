package 해시.베스트앨범;

import java.util.*;
class Last {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map =new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        ArrayList<String>s1=new ArrayList<>(map.keySet());
        Collections.sort(s1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        ArrayList<Integer>a1=new ArrayList<>();
        boolean check[]=new boolean[genres.length];
        for(int i=0; i<s1.size(); i++){
            String s=s1.get(i);

            int max=0;
            int max1=0;
            int idx=0;
            int idx1=0;
            for(int j=0; j<genres.length; j++){
                String tm=genres[j];
                if(tm.equals(s) && check[j]==false){
                    if(max<plays[j]){
                        max=plays[j];
                        idx=j;
                    }
                }
            }
            check[idx]=true;
            for(int j=0; j<genres.length; j++){
                String tm=genres[j];
                if(tm.equals(s) && check[j]==false){
                    if(max1<plays[j]){
                        max1=plays[j];
                        idx1=j;
                    }
                }
            }
            a1.add(idx);
            if(max1!=0){
                a1.add(idx1);
            }
        }
        int answer[]=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;
    }
}
