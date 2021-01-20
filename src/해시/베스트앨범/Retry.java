package 해시.베스트앨범;

import java.util.*;
class Retry {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer>map=new HashMap<>();

        //장르별 총 재생횟수 구하기
        for(int i=0; i<genres.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }

        ArrayList<String>s1=new ArrayList<>(map.keySet());
        //많이 재생된 장르부터 나오게 하기
        Collections.sort(s1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=0; i<map.size(); i++){
            String s2=s1.get(i);
            int max=0;
            int first=0;
            int second=0;
            //1,2만 기록하면 되므로 변수 2개 선언
            //장르별 최댓값 구하기
            for(int j=0; j<genres.length; j++) {
                if (s2.equals(genres[j])) {
                    if (max < plays[j]) {
                        max = plays[j];
                        first = j;
                    }
                }
            }
            max=0;

            for(int j=0; j<genres.length; j++) {
                if (s2.equals(genres[j])) {
                    if (j != first && max < plays[j]) {
                        max = plays[j];
                        second = j;

                    }
                }
            }
            a1.add(first);
            //장르의 곡이 하나라면 하나만 기록
            if(max!=0){
                a1.add(second);
            }

        }

        int answer[]=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;
    }
}
