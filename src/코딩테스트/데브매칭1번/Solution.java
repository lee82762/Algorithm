package 코딩테스트.데브매칭1번;

class Solution {
    public int solution(String[] drum) {
        String map[][]=new String[drum.length][drum[0].length()];
        int answer=0;
        for(int i=0; i<drum.length; i++){
            String s=drum[i];
            for(int j=0; j<s.length(); j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }
        for(int i=0; i<map[0].length; i++){
            int cnti=0;
            int cntj=i;
            int checkstar=0;


            while (true){
                if(cnti>=map.length){
                    answer++;
                    break;
                }
                if(map[cnti][cntj].equals("#")) {
                    cnti++;
                }
                else if(map[cnti][cntj].equals("*")){
                    if(checkstar==0) {
                        cnti++;
                        checkstar++;
                    }
                    else{
                        break;
                    }
                }
                else if(map[cnti][cntj].equals("<")){
                    cntj--;

                }
                else if(map[cnti][cntj].equals(">")){
                    cntj++;
                }


            }

        }
        return answer;
    }
}
