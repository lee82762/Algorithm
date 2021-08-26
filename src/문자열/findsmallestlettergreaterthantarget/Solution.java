package 문자열.findsmallestlettergreaterthantarget;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char answer = 0;
        for(int i=0; i<letters.length; i++){
            if(target<letters[i]){
                answer=letters[i];
                break;
            }
        }
        if(answer==0){
            answer=letters[0];
        }
        return answer;
    }
}
