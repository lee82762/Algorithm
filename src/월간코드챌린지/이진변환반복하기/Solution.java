package 월간코드챌린지.이진변환반복하기;

class Solution {
    public int[] solution(String s) {
        int cnt=0;
        int cnt1=0;
        int cnt2=0;
        int n=6;
        String answer=Integer.toBinaryString(n);


        while(true){
            cnt2++;
            cnt1=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    cnt1++;
                    cnt++;
                }
            }
            int a=s.length()-cnt1;
            s=Integer.toBinaryString(a);

            if(s.equals("1")){
                break;
            }

        }
        int[] result=new int[2];
        result[0]=cnt2;
        result[1]=cnt;
        return result;
    }
}

