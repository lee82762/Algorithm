package 코딩테스트.안랩4번;

import java.util.HashMap;
import java.util.Stack;
class Solution {
    public int[] solution(String s, int[] idx) {
        int answer[] = new int[idx.length];
        Stack<Character>st = new Stack<>();
        Stack<Integer> num = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //map에 idx 수 넣기
        for(int i = 0; i < idx.length; i++){
            map.put(idx[i],-1);
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c == '{' || c =='}') {
                if(st.isEmpty()){
                    st.add(c);
                    num.add(i);
                }
                else{
                    if(st.peek() =='{' && c=='}'){
                        st.pop();
                        int a = num.pop();
                        int b = i;
                        //짝 맞은 괄호 인덱스 map에 넣어주기
                        map.put(a,b);
                        map.put(b,a);
                    }
                    else{
                        st.add(c);
                        num.add(i);
                    }
                }
            }

        }

        for(int i = 0; i < idx.length; i++){
            int tm = idx[i];
            answer[i] = map.get(tm);
        }
        return answer;
    }
}
