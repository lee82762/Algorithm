package 코딩테스트.새마을중앙이번;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int math_scores[]={80,50,30,20,10};
        int english_scores[]={24,39,47,63,75};

        int mathrank[]=new int[math_scores.length];
        int engrank[]=new int[english_scores.length];
        Arrays.fill(mathrank,1);
        Arrays.fill(engrank,1);

        for(int i=0; i<math_scores.length; i++){
            for(int j=0; j<math_scores.length; j++){
                if(math_scores[i]<math_scores[j]){
                    mathrank[i]+=1;
                }
            }
        }

        for(int i=0; i<english_scores.length; i++){
            for(int j=0; j<english_scores.length; j++){
                if(english_scores[i]<english_scores[j]){
                    engrank[i]+=1;
                }
            }
        }
        int answer=0;
        for(int i=0; i<mathrank.length; i++){
            for(int j=0; j<mathrank.length; j++){
                if(i!=j){
                    if(mathrank[i]<mathrank[j]&&engrank[i]<engrank[j]){
                        answer++;
                    }
                }

            }
        }

        System.out.println(answer);
    }
}
