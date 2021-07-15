package ICT.이번;

import java.util.Arrays;

class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinDeletions(String s) {
        String s1[]=s.split("");
        Arrays.sort(s1);
        int answer=0;
        for(int i=0; i<s1.length-1; i++){
            if(!s1[i].equals(s1[i+1])){
                continue;
            }
            else{
                answer++;
            }
        }
        return answer;

    }

}
