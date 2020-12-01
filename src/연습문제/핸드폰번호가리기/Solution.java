package 연습문제.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String []arr={};
        arr=phone_number.split("");
        for(int i=0; i<arr.length-4; i++){

            arr[i]="*";

        }



        for(int i=0; i<arr.length; i++){
            answer+=arr[i];
        }
        return answer;
    }
}