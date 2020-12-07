package 연습문제.다음큰숫자;

class Solution {
    public int solution(int n) {
        int cnt=0;
        String b=Integer.toBinaryString(n);
        for(int i=0; i<b.length(); i++){
            char c=b.charAt(i);
            if(c=='1'){
                cnt++;
            }
        }

        while (true){
            n++;
            int cnt1=0;
            String a=Integer.toBinaryString(n);
            for(int i=0; i<a.length(); i++){
                char c=a.charAt(i);
                if(c=='1'){
                    cnt1++;
                }

            }
            if(cnt==cnt1){
                break;
            }

        }

        return n;
    }
}
