package DFSandBFS.올리브영2번;

class Solution {
    static boolean visit[];
    static int answer=1000001;
    public int solution(String[] subway, int start, int end) {

        visit=new boolean[subway.length];
        for(int i=0; i<subway.length; i++){
            String s[]=subway[i].split(" ");
            for(int j=0; j<s.length; j++){
                int a=Integer.parseInt(s[j]);
                if(a==start){
                    visit[i]=true;
                    dfs(start,end,subway,0,s);

                }
            }
        }
        return answer;
    }
    static void dfs(int start, int end, String subway[],int dept,String station[]){


        for(int k=0; k<station.length; k++){
            int tm=Integer.parseInt(station[k]);
            if(tm==end){
                answer=Math.min(answer,dept);

                return;
            }

            for(int i=0; i<subway.length; i++) {
                String s[] = subway[i].split(" ");
                if (visit[i] == false) {
                    for (int j = 0; j < s.length; j++) {
                        int a = Integer.parseInt(s[j]);
                        if (a == tm) {
                            visit[i]=true;
                            dfs(start,end,subway,dept+1,s);
                            visit[i]=false;
                        }
                    }
                }
            }

        }
    }
}