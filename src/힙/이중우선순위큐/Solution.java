package 힙.이중우선순위큐;

import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operationss) {
        ArrayList<Integer>a1=new ArrayList<>();

        for (int i = 0; i < operationss.length; i++) {
            String s1[] = operationss[i].split(" ");
            for (int j = 0; j < s1.length; j++) {
                if (s1[j].equals("I")) {
                    //값 넣기
                    a1.add(Integer.parseInt(s1[j+1]));
                    Collections.sort(a1);
                } else if (s1[j].equals("D") && s1[j + 1].equals("1")) {
                    //최댓값 삭제
                    if(!a1.isEmpty()) {
                        a1.remove(a1.size()-1);
                    }
                } else if (s1[j].equals("D") && s1[j + 1].equals("-1")) {
                    //최솟값 삭제
                    if(!a1.isEmpty()) {
                        a1.remove(0);
                    }

                }
            }
        }
        int []answer =new int[2];
        if(a1.isEmpty()) {
            answer = new int[]{0,0};
        } else {
            answer = new int[] {a1.get(a1.size() -1), a1.get(0)};
        }
        return answer;

    }
}
