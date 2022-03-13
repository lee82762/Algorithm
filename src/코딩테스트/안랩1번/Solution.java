package 코딩테스트.안랩1번;

class Solution {
    public int solution(String[] s) {
        int answer = 0;
        int temp_answer = 0;
        for(int i = 0; i < s.length; i++){
            s[i] = s[i].toLowerCase();
            String result[] = new String[3];
            result[0] = "";
            result[1] = "";
            result[2] = "";
            if(s[i].length() == 1){
                answer = 1;
                continue;
            }

            for(int j = 0; j < s[i].length(); j++){
                char c = s[i].charAt(j);
                if(c == '!' || c=='@' || c=='#' || c=='$' || c=='%'|| c=='^' || c=='&' || c=='*'){
                    result[0]+=c;
                }
                else if(Character.isDigit(c)){
                    result[1] += c;
                }
                else{
                    result[2] += c;
                }
            }

            for(int j = 0; j < result.length; j++){
                if(check(result[j]) == true && result[j].length() != 0){
                    temp_answer = s[i].length();
                }
                else{
                    temp_answer = 0;
                    break;
                }
            }
            answer = Math.max(answer,temp_answer);

        }
        return answer;
    }
    //팰린드롬 체크 함수
    static public boolean check(String s){
        int len = s.length();
        int start = 0;
        int end = len - 1;
        boolean result = true;

        while(start <= end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if(startChar != endChar) {
                result = false;
                break;
            }

            start++;
            end--;
        }
        return result;
    }
}
