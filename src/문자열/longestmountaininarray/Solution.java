package 문자열.longestmountaininarray;

class Solution {
    public int longestMountain(int[] arr) {
        int i=1;
        int len=arr.length-1;
        int answer=0;

        while (i<=len){
            int answer1=0;
            int answer2=0;
            while (i<=len&&arr[i]==arr[i-1]){
                i++;
            }

            while (i<=len&&arr[i]>arr[i-1]){
                i++;
                answer1++;
            }

            while (i<=len&&arr[i]<arr[i-1]){
                i++;
                answer2++;
            }

            if(answer1!=0&&answer2!=0){
                answer=Math.max(answer,answer1+answer2+1);
            }

        }
        return answer;

    }
}