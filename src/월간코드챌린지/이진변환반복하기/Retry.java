package 월간코드챌린지.이진변환반복하기;

class Retry {
    public int[] solution(String s) {
        int answer[]=new int[2];
        int cnt=0;
        int cnt1=0;
        while (!s.equals("1")){
            String s1="";
            for(int i=0; i<s.length(); i++){
                char c=s.charAt(i);

                if(c=='0'){
                    cnt++;
                    continue;
                }
                else{
                    s1+=c;
                }


            }
            int n=s1.length();
            s=Integer.toBinaryString(n);
            cnt1++;
        }
        answer[0]=cnt1;
        answer[1]=cnt;
        return answer;
    }
}