package DFSandBFS.NQueen;

class Solution {
    static int row[];
    static boolean visit[];
    static int answer=0;
    public int solution(int n) {
        row=new int[n];
        visit=new boolean[n];
        dfs(n,0);
        return answer;
    }
    static void dfs(int n,int dept){
        if(dept==n){
            answer++;
            return;
        }

        for(int i=0; i<n; i++){
            if(visit[i]==false){
                visit[i]=true;
                row[dept]=i;
                if(check(dept))
                    dfs(n,dept+1);
                visit[i]=false;
            }
        }
    }
    static boolean check(int dept){
        for(int i=0; i<dept; i++){
            //행에 있으면
            if(row[i]==row[dept]) return false;
            //대각 확인 행차이와 열 차이가 같으면 대각이 있음
            if(Math.abs(i-dept)==Math.abs(row[i]-row[dept])) return false;
        }
        return true;
    }
}
