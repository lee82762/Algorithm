package 위클리챌린지.팔주차;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int ra=0;
        int se=0;

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                ra=Math.max(ra,sizes[i][0]);
            }
            else {
                ra = Math.max(ra, sizes[i][1]);
            }
            if(sizes[i][1]>sizes[i][0]){
                se=Math.max(se,sizes[i][0]);
            }
            else{
                se=Math.max(se,sizes[i][1]);
            }
        }
        answer=ra*se;
        return answer;
    }
}
