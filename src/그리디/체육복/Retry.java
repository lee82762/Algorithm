package 그리디.체육복;

class Retry {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer=n-lost.length;

        //도난당한사람과 여벌의옷을 가진사람이 같을때의의 조건처리
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    answer++;
                    break;

                }
            }
        }
        //도난당한사람과 여벌의옷을 가진사람이 다를때의 조건처리
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]-1||lost[i]==reserve[j]+1){
                    lost[i]=-1;
                    reserve[j]=-1;
                    answer++;
                    break;

                }
            }
        }
        return answer;
    }
}
