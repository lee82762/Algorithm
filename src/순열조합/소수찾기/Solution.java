package 순열조합.소수찾기;

import java.util.ArrayList;
class Solution {
    private static ArrayList<Integer>a1=new ArrayList<>();
    public int solution(String numbers) {

        String s1[]=numbers.split("");
        int[] arr = new int[s1.length];
        for(int i=0; i<s1.length; i++){
            arr[i]=Integer.parseInt(s1[i]);
        }

        int n = arr.length;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        for(int i=0; i<=arr.length; i++){
            perm(arr, output, visited, 0, n, i);
        }



        int answer=0;
        for(int i=0; i<a1.size(); i++){
            int a=a1.get(i);
            int cnt=0;
            for(int j=1; j<=a; j++){
                if(a%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                answer++;
            }
        }
        return answer;
    }
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        String answer="";
        if (depth == r) {
            for (int i = 0; i < r; i++) {

                answer+=Integer.toString(output[i]);
            }
            if(!answer.equals("")){
                if(a1.contains(Integer.parseInt(answer))){

                }
                else {
                    a1.add(Integer.parseInt(answer));
                }

            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }

        }
    }
}
