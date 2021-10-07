package 리틀코드.checkifnanditsdoubleexist;

class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean answer=false;
        for(int i=0; i<arr.length; i++){
            int tm=arr[i]*2;
            for(int j=0; j<arr.length; j++){
                if(i==j) continue;
                if(arr[j]==tm){
                    answer=true;
                }
            }
        }

        return answer;
    }
}
