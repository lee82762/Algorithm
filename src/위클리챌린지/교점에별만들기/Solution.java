package 위클리챌린지.교점에별만들기;

import java.util.*;
class Solution {
    public String[] solution(int[][] line) {
        long minX = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;
        ArrayList<ArrayList<Integer>> temp=new ArrayList<>();

        for(int i=0; i<line.length-1; i++){
            long a=line[i][0];
            long b=line[i][1];
            long e=line[i][2];

            for(int j=i+1; j<line.length; j++){
                if(i==j) continue;
                long c=line[j][0];
                long d=line[j][1];
                long f=line[j][2];
                if((a*d)-(b*c)==0) continue;
                long tem=(a*d)-(b*c);
                long x=(b*f)-(e*d);
                long y=(e*c)-(a*f);

                if(x%tem == 0 && y%tem ==0){
                    ArrayList<Integer>a1=new ArrayList<>();
                    a1.add((int)x/(int)tem);
                    a1.add((int)y/(int)tem);
                    if(!temp.contains(a1)){
                        temp.add(a1);
                    }
                    minX=Math.min(minX,(long)((int)x/(int)tem));
                    maxX=Math.max(maxX,(long)((int)x/(int)tem));

                    minY=Math.min(minY,(long)((int)y/(int)tem));
                    maxY=Math.max(maxY,(long)((int)y/(int)tem));
                }

            }
        }

        boolean visit[][]=new boolean[(int)(maxY-minY)+1][(int)(maxX-minX)+1];


        for(ArrayList<Integer> a1: temp){
            int a=a1.get(0)-(int)minX;
            int b=a1.get(1)-(int)maxY;

            visit[Math.abs(b)][Math.abs(a)]=true;
        }
        String answer[]=new String[visit.length];
        int i=0;

        for(boolean check[] : visit){
            StringBuilder sb=new StringBuilder();
            for(boolean ch: check){
                if(ch){
                    sb.append("*");
                }
                else{
                    sb.append(".");
                }
            }
            answer[i]=sb.toString();
            i++;
        }
        return answer;
    }
}
