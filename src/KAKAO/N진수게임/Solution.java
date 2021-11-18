package KAKAO.N진수게임;

class Solution {
    static StringBuilder sb = new StringBuilder();
    public String solution(int n, int t, int m, int p) {
        for(int i=0; i<= t*m; i++){
            sb.append(Integer.toString(i,n));
        }
        StringBuilder answer=new StringBuilder();
        String result=sb.toString();

        for(int i=0; i<t*m; i++){
            char c=result.charAt(i);
            if(i%m==(p-1)){
                answer.append(c);
            }
        }
        return answer.toString().toUpperCase();
    }
}
