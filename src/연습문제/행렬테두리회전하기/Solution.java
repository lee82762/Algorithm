package 연습문제.행렬테두리회전하기;

import java.util.ArrayList;



class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] map=new int[rows][columns];
        int cnt=1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                map[i][j]=cnt;
                cnt++;
            }
        }


        int answer[] = new int[queries.length];
        for(int x=0; x<queries.length; x++) {


            int re[][] = new int[(queries[x][2] - queries[x][0]) + 1][(queries[x][3] - queries[x][1]) + 1];
            int re1[][] = new int[(queries[x][2] - queries[x][0]) + 1][(queries[x][3] - queries[x][1]) + 1];

            ArrayList<Integer> a1 = new ArrayList<>();


            for (int i = queries[x][0]-1; i <= queries[x][2]-1; i++) {
                for (int j = queries[x][1]-1; j <= queries[x][3]-1; j++) {

                    a1.add(map[i][j]);
                }
            }
            int cnt1 = 0;

            for (int i = 0; i < re.length; i++) {
                for (int j = 0; j < re[0].length; j++) {
                    re[i][j] = a1.get(cnt1);
                    cnt1++;

                }
            }


            for (int i = 0; i < re.length; i++) {
                for (int j = 0; j < re[0].length; j++) {
                    if (i == 0 && j == 0) {
                        re1[i][j] = re[i + 1][j];
                    } else if (i == 0 && j != 0) {

                        re1[i][j] = re[i][j - 1];
                    } else if (i != 0 && j == 0 && i != re.length - 1) {
                        re1[i][j] = re[i + 1][j];
                    } else if (i != 0 && j >= 1 && j < re[0].length - 1 && i != re.length - 1) {

                        re1[i][j] = re[i][j];
                    } else if (i != 0 && j == re[0].length - 1 && i != re.length - 1) {

                        re1[i][j] = re[i - 1][j];
                    } else if (i == re.length - 1 && j != re[0].length - 1) {


                        re1[i][j] = re[i][j + 1];
                    } else if (i == re.length - 1 && (j >= 1 && j < re[0].length - 1)) {


                        re1[i][j] = re[i][j + 1];
                    } else if (i == re.length - 1 && j == re[0].length - 1) {

                        re1[i][j] = re[i - 1][j];
                    }
                }
            }


            int answer1 = 100001;
            for (int i = 0; i < re.length; i++) {
                for (int j = 0; j < re[0].length; j++) {
                    if((i>=1&&i<re.length-1)&&(j>=1&&j<re[0].length-1)){
                        continue;
                    }
                    answer1 = Math.min(answer1, re1[i][j]);

                }
            }
            answer[x]=answer1;




            int c1 = 0;
            int c2 = 0;

            for (int i = queries[x][0]-1; i <= queries[x][2]-1; i++) {
                for (int j = queries[x][1]-1; j <= queries[x][3]-1; j++) {
                    map[i][j] = re1[c1][c2++];

                }
                c1++;
                c2 = 0;
            }

        }

        return answer;
    }
}