package 순열조합.소수찾기;

import java.util.ArrayList;
class Retry {
    static ArrayList<String>an=new ArrayList<>();
    public int solution(String numbers) {
        String []s1=numbers.split("");
        int answer=0;
        int []a1=new int[s1.length];
        for(int i=0; i<a1.length; i++){
            a1[i]=Integer.parseInt(s1[i]);
        }

        int n=s1.length;
        int r=2;
        boolean visit[]=new boolean[n];

        for(int i=1; i<=n; i++) {
            String []output=new String[i];
            dfs(s1, output, visit, 0, n, i);
        }
        ArrayList<Integer>an1=new ArrayList<>();
        for(int i=0; i<an.size(); i++){
            if(an1.contains(Integer.parseInt(an.get(i)))){
                continue;
            }
            else {
                an1.add(Integer.parseInt(an.get(i)));
            }
        }

        for(int i=0; i<an1.size(); i++){
            int a=an1.get(i);

            if(a<2){
                continue;
            }
            else{

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
        }


        return answer;

    }
    public static void dfs(String []s1,String []output,boolean []visit,int dept,int n,int r){
        if(dept==r){
            String s="";
            for(int i=0; i<r; i++){

                s+=output[i];
            }
            an.add(s);
            return;
        }
        else{
            for(int i=0; i<n; i++){
                if(visit[i]!=true){
                    visit[i]=true;
                    output[dept]=s1[i];
                    dfs(s1,output,visit,dept+1,n,r);
                    visit[i]=false;
                }
            }
        }
    }
}