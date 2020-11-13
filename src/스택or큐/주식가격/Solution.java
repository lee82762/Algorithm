package 스택or큐.주식가격;

class Solution {
    public int[] solution(int[] price) {
        int []answer=new int[price.length];



        for(int i=0; i<price.length-1; i++){
            for(int j=i+1; j<price.length; j++){
                if(price[i]>price[j]){
                    answer[i]=Math.abs(i-j);
                    break;
                }
                else{
                    answer[i]=price.length-(i+1);

                }

            }
        }
        return answer;
    }
}