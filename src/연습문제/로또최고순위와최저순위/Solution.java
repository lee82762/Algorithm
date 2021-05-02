package 연습문제.로또최고순위와최저순위;

import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int cnt=0;
        int cnt1=0;

        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                cnt1++;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    cnt++;

                }
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt);
        int max=cnt1+cnt;
        int min=cnt;
        int arr[]=new int[2];
        arr[0]=max;
        arr[1]=min;
        int answer[]=new int[2];
        for(int i=0; i<arr.length; i++){
            if(arr[i]==6){
                answer[i]=1;
            }
            else if(arr[i]==5){
                answer[i]=2;
            }
            else if(arr[i]==4){
                answer[i]=3;
            }
            else if(arr[i]==3){
                answer[i]=4;
            }
            else if(arr[i]==2){
                answer[i]=5;
            }
            else{
                answer[i]=6;
            }
        }
        return answer;
    }
}