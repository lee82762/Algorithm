package 리틀코드.ExcelSheetColumnNumber;

class Solution {
    public int titleToNumber(String s) {
        int answer=0;
        for(char c:s.toCharArray()){
            answer*=26;
            answer+=c-64;
        }
        return answer;
    }
}
