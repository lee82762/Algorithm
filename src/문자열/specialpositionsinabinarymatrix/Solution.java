package 문자열.specialpositionsinabinarymatrix;

class Solution {
    public int numSpecial(int[][] mat) {
        int answer=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1){

                    int cnt=0;
                    for(int k=0; k<mat[0].length; k++){
                        if(mat[i][k]==1){
                            cnt++;
                        }
                    }

                    for(int k=0; k<mat.length; k++){
                        if(mat[k][j]==1){
                            cnt++;
                        }
                    }
                    if(cnt<=2){
                        answer++;
                    }


                }
            }
        }
        return answer;

    }
}
