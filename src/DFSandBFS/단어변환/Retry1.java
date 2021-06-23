package DFSandBFS.단어변환;

class Retry1 {
    static int answer=0;

    public int solution(String begin, String end, String[] words) {

        boolean visit[]=new boolean[words.length];
        dfs(begin,end,words,visit,0);
        return answer;

    }

    static void dfs(String begin,String end,String words[],boolean []visit,int result){
        if(begin.equals(end)){
            answer=result;
            return;
        }

        for(int i=0; i<words.length; i++){
            String temp=words[i];
            int cnt=0;
            if(visit[i]==false) {
                for (int j = 0; j < temp.length(); j++) {
                    char c = begin.charAt(j);
                    char c1 = temp.charAt(j);
                    if (c != c1) {
                        cnt++;
                    }
                }

                if (cnt == 1) {
                    visit[i] = true;
                    dfs(temp, end, words, visit, result + 1);
                    visit[i] = false;
                }
            }

        }

    }

}
