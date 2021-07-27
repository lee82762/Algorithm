package 월간코드챌린지.풍선터트리기;

class Solution {
    public int solution(int[] a) {
        int left=0;
        int right=a.length-1;
        int min=a[left];
        int max=a[right];
        int answer=1;
        while (left<right){
            if(min<max){
                right--;
                if(a[right]<max){
                    answer++;
                    max=a[right];
                }

            }
            else{
                left++;
                if(a[left]<min){
                    answer++;
                    min=a[left];
                }

            }
        }
        return answer;
    }
}
