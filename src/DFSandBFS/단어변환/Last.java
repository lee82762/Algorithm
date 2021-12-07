package DFSandBFS.단어변환;

class Last {
    static boolean visit[];
    static int answer=0;
    public int solution(String begin, String target, String[] word) {

        visit=new boolean[word.length];
        dfs(begin,target,word,0);

        return answer;

    }
    static public void dfs(String begin,String target,String word[],int dept){
        if(begin.equals(target)){
            answer=dept;
            return;
        }

        for(int i=0; i<word.length; i++){
            String s=word[i];
            int cnt=0;
            if(visit[i]==false){
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(j)!=begin.charAt(j)){
                        cnt++;
                    }
                }
                if(cnt==1){
                    visit[i]=true;
                    dfs(s,target,word,dept+1);
                    visit[i]=false;
                }

            }
        }
    }

}