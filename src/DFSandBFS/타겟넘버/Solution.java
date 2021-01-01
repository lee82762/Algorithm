package DFSandBFS.타겟넘버;

class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target);
        return answer;

    }
    public static void dfs(int []numbers,int dept,int target){
        int sum=0;
        if(dept==numbers.length){
            for(int i=0; i<numbers.length; i++){
                sum+=numbers[i];
            }
            if(target==sum){
                answer++;
            }

        }
        else{
            //백트레킹
            numbers[dept]*=1;
            dfs(numbers,dept+1,target);
            numbers[dept]*=-1;
            dfs(numbers,dept+1,target);
        }
    }

}