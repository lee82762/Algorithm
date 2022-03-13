package 코딩테스트.안랩5번;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class Solution {
    static int answer =0;
    public int solution(String[] cards) {
        int n = cards.length;
        boolean visit[] = new boolean[n];
        for(int i = 3; i < n; i++){
            comb(cards,n,visit,i,0);
        }
        return answer;
    }
    //3개이상의 모든 카드 조합 구하는 함수
    static void comb(String cards[], int n, boolean visit[], int r , int start ){
        if(r == 0){
            ArrayList<String> temp =new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(visit[i]){
                    temp.add(cards[i]);
                }
            }
            check(temp);
            return;
        }

        for(int i = start; i < n; i++){
            visit[i] = true;
            comb(cards,n,visit,r-1,i+1);
            visit[i] = false;
        }
    }
    //조건에 맞는 카드 조합이 있는지 확인 함수
    static public void check(ArrayList<String> temp){
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < temp.size(); i++){
            String re[] = temp.get(i).split("");
            map.put(re[0],map.getOrDefault(re[0],0)+1);
            map.put(re[1],map.getOrDefault(re[1],0)+1);
        }
        ArrayList<String> s1 = new ArrayList<>(map.keySet());
        Collections.sort(s1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        //조합 크기와 map의 젤큰 값이 같다면
        if(map.get(s1.get(0))==temp.size()){
            answer+=(map.get(s1.get(0))*map.get(s1.get(0)));
        }
        //젤큰 값이 1이면 서로다른 카드이므로 리스트 크기값 넣어주기
        else if(map.get(s1.get(0))==1){
            answer+=(temp.size()*temp.size());
        }

    }
}
