package 문자열.ShiftingLetters;

//시간 초과
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for(int i=0; i<shifts.length; i++){
            String temp=s.substring(0,i+1);
            String temp1=s.substring(i+1,s.length());
            String temp2="";
            for(int j=0; j<temp.length(); j++){
                char c=temp.charAt(j);
                char c1=(char)((c-'a'+shifts[i])%26+'a');
                temp2+=c1;
            }
            s=temp2+temp1;
        }
        return s;

    }
}