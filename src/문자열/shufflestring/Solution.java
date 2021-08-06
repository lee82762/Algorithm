package 문자열.shufflestring;

class Solution {
    public String restoreString(String s, int[] indices) {
        String s1[]=new String[indices.length];
        String s2[]=s.split("");
        String answer="";
        for(int i=0; i<indices.length; i++){
            s1[indices[i]]=s2[i];
        }

        for(int i=0; i<s1.length; i++){
            answer+=s1[i];
        }
        return answer;
    }
}
