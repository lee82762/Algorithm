package DFSandBFS.단어변환;

class Solution {
    static int answer=0;
    public int solution(String begin, String target, String[] word) {
        boolean visit[]=new boolean[word.length];
        dfs(begin,target,visit,word,0);
        return answer;

    }
    public static void dfs(String begin,String target, boolean []visit,String []word,int cnt1){
        if(begin.equals(target)){
            answer=cnt1;
            return;
        }
        for(int i=0; i<word.length; i++){
            if(!visit[i]) {
                int cnt = 0;
                for (int j = 0; j < begin.length(); j++) {
                    char c=begin.charAt(j);
                    char c1=word[i].charAt(j);
                    if(c!=c1){
                        cnt++;
                    }
                }
                if(cnt==1){
                    visit[i]=true;
                    dfs(word[i],target,visit,word,cnt1+1);
                    visit[i]=false;
                }
            }
        }
    }
}


