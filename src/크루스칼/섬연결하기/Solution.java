package 크루스칼.섬연결하기;

import java.util.*;
//크루스칼 알고리즘

class Solution {
    static int re[];
    static int answer=0;
    public int solution(int n, int[][] costs) {
        ArrayList<int []>a1=new ArrayList<>();
        re=new int[n];
        for(int i=0; i<n; i++){
            re[i]=i;
        }

        for(int []cost:costs){
            a1.add(cost);
        }
        Collections.sort(a1,(o1, o2) -> o1[2]-o2[2]);
        for (int i = 0; i < a1.size(); i++) {

            if (find(a1.get(i)[0]) != find(a1.get(i)[1])) {
                union(a1.get(i)[0], a1.get(i)[1]);
                answer += a1.get(i)[2];
                continue;
            }
        }
        return answer;
    }

    //union-find 알고리즘
    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a > b) {
            re[a] = b;
        } else {
            re[b] = a;
        }
    }

    private static int find(int x) {
        if (re[x] == x)
            return x;
        else
            return find(re[x]);
    }
}
