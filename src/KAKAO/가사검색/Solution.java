package KAKAO.가사검색;
//효율성1,2,3 실패
class Solution {
    public int[] solution(String[] words, String[] queries) {
        int answer[]=new int[queries.length];
        for(int i=0; i<queries.length; i++){
            String s=queries[i];
            for(int j=0; j<words.length; j++){
                if(s.length()==words[j].length()){
                    boolean ans=true;
                    for(int k=0; k<s.length(); k++){
                        char c=s.charAt(k);
                        char c1=words[j].charAt(k);
                        if(c!=c1&&c!='?'){
                            ans=false;
                            break;
                        }

                    }
                    if(ans!=false){
                        answer[i]++;
                    }
                }
                else{
                    continue;
                }
            }

        }
        return answer;
    }
}
