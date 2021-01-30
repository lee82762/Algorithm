package KAKAO.메뉴리뉴얼;

//조합을 이용해 값을 구한다.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
class Solution {
    static HashMap<String,Integer>map=new HashMap<>();
    public String[] solution(String[] orders, int[] course) {

        ArrayList<String>ans=new ArrayList<>();
        for(int j=0; j<course.length; j++) {
            int r=course[j];
            for (int i = 0; i < orders.length; i++) {
                String[] s1 = orders[i].split("");
                Arrays.sort(s1);
                boolean []visit=new boolean[s1.length];
                int n=s1.length;
                //조합
                combination(s1,visit,0,n,r);

            }

            //value 값들을 내림차순으로 정렬
            ArrayList<String>st=new ArrayList<>(map.keySet());
            Collections.sort(st,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));

            for(int i=0; i<st.size(); i++){
                //가장큰수와 비교하여 큰 수랑 같으면 리스트에 값들 넣어주기!
                int re=map.get(st.get(0));
                int re1=map.get(st.get(i));
                if(re==re1&&re>1){
                    ans.add(st.get(i));

                }


            }
            map.clear();

        }
        //오름차순으로 정렬
        Collections.sort(ans);

        String answer[]=new String[ans.size()];

        for(int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
    //조합 구하는 함수
    static void combination(String arr[],boolean []visit,int start,int n, int r){
        if(r==0){
            String st="";
            for(int i=0; i<n; i++){
                if(visit[i]){
                    st+=arr[i];

                }

            }
            //조합의 값들을 해쉬맵에다가 같은것이 들어오면 숫자를 늘리는 방식으로 저장한다.
            map.put(st,map.getOrDefault(st,0)+1);
            return;
        }
        for(int i=start; i<n; i++){
            visit[i]=true;
            combination(arr,visit,i+1,n,r-1);
            visit[i]=false;
        }
    }
}