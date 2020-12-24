package 해시.베스트앨범;

//다시 풀어 맞춘문제
import java.util.*;
class Solution1 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer>map=new HashMap<>();
        //장르별 재생횟수 더하기
        for(int i=0; i<genres.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }

        ArrayList<String>s1=new ArrayList<>(map.keySet());
        //장르별 재생횟수를 내림차순으로 정렬
        Collections.sort(s1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=0; i<map.size(); i++){
            String s=s1.get(i);
            int max=0;
            //인기순위 2개까지만 하면 되므로 변수를 두개둔다.
            int first=0;
            int second=0;
            for(int j=0; j<genres.length; j++){
                if(s.equals(genres[j])){
                    if(max<plays[j]) {
                        max = plays[j];
                        first = j;
                    }
                }
            }
            max=0; //장르안의 곡이 하나밖에 없을때를 대비한 코드
            for(int j=0; j<genres.length; j++){
                if(s.equals(genres[j])){
                    if(j!=first&&max<plays[j]) {
                        max = plays[j];
                        second = j;
                    }
                }
            }

            a1.add(first);
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
