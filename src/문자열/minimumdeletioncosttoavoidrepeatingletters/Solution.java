package 문자열.minimumdeletioncosttoavoidrepeatingletters;
class Solution {
    public int minCost(String s, int[] cost) {
        String s1[]=s.split("");
        int i=1;
        int temp=0;
        int answer=0;
        while (i<s1.length){

            if(s1[i].equals(s1[temp])){
                if(cost[i]>cost[temp]){
                    answer+=cost[temp];
                    temp=i;
                }
                else{
                    answer+=cost[i];
                }
            }
            else{
                temp=i;
            }
            i++;
        }
        return answer;
    }
}
