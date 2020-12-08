package 연습문제.영어끝말잇기;

import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] cities) {
        int []answer=new int[2];


        ArrayList<String>s1=new ArrayList<>();
        for(int i=0; i<cities.length; i++){


            //같은 단어 반복 확인
            if(s1.isEmpty()){
                s1.add(cities[i]);
            }
            else {
                if (s1.contains(cities[i])) {

                    answer[0]=(i % n) + 1;
                    answer[1]=(i / n)+1;
                    break;

                }
                else{
                    s1.add(cities[i]);
                }
            }
            //앞사람이 말한 단어 마지막문자와 와 다음의 단어의 앞글자 비교확인
            if(i!=0) {
                char c = cities[i].charAt(0);
                char c1 = cities[i - 1].charAt(cities[i-1].length() - 1);

                if (c != c1) {

                    answer[0]=(i % n) + 1;
                    answer[1]=(i / n)+1;
                    break;
                }
            }


        }

        return answer;
    }
}
