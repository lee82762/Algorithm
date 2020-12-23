package 해시.베스트앨범;

import java.util.*;

//처음 푼코드 테스트코드 통과 / 체점 30점

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer>map=new HashMap<>();



        for(int i=0; i<genres.length; i++){

            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        //System.out.println(map1);
        LinkedList<String>list=new LinkedList<>(map.keySet());
        Collections.sort(list,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            String s=list.get(i);

            LinkedList<Integer>st=new LinkedList<>();
            for(int j=0; j<genres.length; j++){
                if(s.equals(genres[j])){
                    if(st.isEmpty()){
                        st.add(j);
                    }
                    else if(plays[j-1]<plays[j]){
                        st.addFirst(j);
                    }
                    else if(plays[j-1]==plays[j]){
                        int cnt=0;
                        cnt=st.get(0);
                        st.removeFirst();
                        st.addFirst(j);
                        st.addFirst(cnt);
                    }
                    else{
                        st.addLast(j);
                    }
                }

            }

            for(int k=0; k<st.size(); k++){
                if(k==2){
                    break;
                }
                else {
                    a1.add(st.get(k));
                }
            }
            st.clear();

        }
        int[] answer=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;
    }
}
