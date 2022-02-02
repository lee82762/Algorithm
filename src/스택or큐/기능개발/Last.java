package 스택or큐.기능개발;

import java.util.ArrayList;
class Last {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> a1 =new ArrayList<>();
        int temp[]=new int[progresses.length];

        for(int i=0; i<progresses.length; i++){
            int a=progresses[i];
            int b=speeds[i];
            int tem=a;
            int cnt=0;
            while (true){
                if(tem>=100){
                    break;
                }
                tem+=b;
                cnt++;
            }
            temp[i]=cnt;
        }

        for(int i=0; i<temp.length; i++){
            int cnt=1;
            for(int j=i+1; j<temp.length; j++){
                if(temp[i]>=temp[j]){
                    cnt++;
                    if(j==temp.length-1){
                        i=j;
                    }
                }
                else{
                    i=(j-1);
                    break;
                }
            }
            a1.add(cnt);
        }

        int answer[]=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;

    }
}
