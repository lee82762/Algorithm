package DFSandBFS.단어변환;

class Retry {
    static int answer=0;
    public int solution(String begin, String target, String[] words) {

        boolean visit[]=new boolean[words.length];

        dfs(begin,target,words,visit,0);

        return answer;
    }

    public static void dfs(String begin, String target, String word[],boolean []visit,int cnt){

        if(begin.equals(target)){
            answer=cnt;
        }

        for(int i=0; i<word.length; i++) {
            int cnt1 = 0;
            if (visit[i] == false) {
                for (int j = 0; j < begin.length(); j++) {
                    char c = begin.charAt(j);
                    char c1 = word[i].charAt(j);

                    if (c != c1) {
                        cnt1++;
                    }
                }
                if (cnt1 == 1) {
                    visit[i] = true;
                    dfs(word[i], target, word, visit, cnt + 1);
                    visit[i] = false;

                }
            }
        }
    }
}