package 코딩테스트.안랩3번;

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int[][] skills, int boss) {
        int answer[] = new int[2];
        int answer1[] = new int[1];
        answer1[0] = -1;
        //다양한 스킬을 써야하므로 작은 공격력 부터 활용
        Arrays.sort(skills, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < skills.length; i++){
            int attack = skills[i][0];
            if(boss>0){
                boss -= attack;
                skills[i][1]--;
                answer[0]++;
                answer[1]++;
            }
        }
        //사용횟수를 줄이기 위해 큰 공격력 부터 확인
        Arrays.sort(skills, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int temp = 0;
        while (true){
            if(boss>0) {
                if(temp == skills.length){
                    break;
                }
                int attack = skills[temp][0];
                int time = skills[temp][1];
                if(time == 0){
                    temp++;
                }

                if (time != 0) {
                    boss -= attack;
                    answer[1]++;
                    skills[temp][1] --;
                }
            }
            else{
                break;
            }
        }
        //만약 보스를 처리 못할경우 -1 리턴
        if(boss>0){
            return answer1;
        }
        else{
            return answer;

        }
    }
}
