package 스택or큐.기능개발;

import java.util.ArrayList;
class Retry {
    public int[] solution(int[] progresses, int[] speeds) {
        int count[]=new int[speeds.length];

        for(int i=0; i<progresses.length; i++){
            int cnt=0;
            while (progresses[i]<100){
                progresses[i]+=speeds[i];
                cnt++;
            }
            count[i]=cnt;
        }
        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=0; i<count.length; i++){
            int pre=count[i];
            int answer=1;
            for(int j=i+1; j<count.length; j++){
                if(pre>=count[j]){
                    answer++;
                }
                else{
                    break;
                }
            }
            i+=(answer-1);
            a1.add(answer);
        }
        int answer[]=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;

    }
}
