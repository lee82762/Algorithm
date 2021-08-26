package 리틀코드.DetermineWhetherMatrixCanBeObtainedByRotation;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        boolean answer=true;
        for(int k=0; k<4; k++){
            answer=true;
            mat=change(mat);
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat.length; j++){
                    if(mat[i][j]!=target[i][j]){
                        answer=false;
                        break;
                    }
                }
                if(answer==false){
                    break;
                }
            }
            if(answer==true){
                break;
            }
        }
        return answer;
    }
    static public int[][] change(int [][]mat){
        int [][]result=new int[mat.length][mat.length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                result[j][mat.length-1-i]=mat[i][j];
            }
        }
        return result;
    }
}
