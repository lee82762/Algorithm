package 문자열.ShiftingLetters;

//시간 초과 해결
class Solution1 {
    public String shiftingLetters(String s, int[] shifts) {
        char []arr=s.toCharArray();

        int c=0;
        for(int i=arr.length-1; i>=0; i--){
            c=(c+shifts[i])%26;
            arr[i]=(char)((arr[i]-'a'+c)%26+'a');
        }


        String answer=new String(arr);
        return answer;

    }
}
