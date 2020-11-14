package KAKAO.영어끝말잇기;

import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int []answer=new int[2];
        ArrayList<String> st=new ArrayList<>();
        int cnt=1;


        for(int i=0; i<words.length; i++) {


            if(i%n==0&&i!=0){
                cnt++;
            }
            if(st.isEmpty()){
                st.add(words[i]);
            }
            else{
                if(!st.contains(words[i])){
                    st.add(words[i]);
                }
                else{
                    answer[0]=((i)%n)+1;
                    answer[1]=cnt;
                    break;

                }
            }

            if (i!=words.length-1&&words[i].charAt(words[i].length()-1) != words[i + 1].charAt(0)) {


                if((i+1)%n==0){
                    cnt++;

                }
                answer[0]=((i+1)%n)+1;
                answer[1]=cnt;
                break;
            }







        }


        return answer;
    }
}