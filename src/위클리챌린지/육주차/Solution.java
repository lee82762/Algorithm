package 위클리챌린지.육주차;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    static public  class Player{
        private double score;
        private int heavy;
        private int weight;
        private int num;

        public Player(double score, int heavy, int weight,int num){
            this.score=score;
            this.heavy=heavy;
            this.weight=weight;
            this.num=num;
        }
    }
    public int[] solution(int[] weights, String[] head2head) {

        DecimalFormat form = new DecimalFormat("#.##");

        double wincount[]=new double[weights.length];
        int heavys[]=new int[weights.length];

        for(int i=0; i<head2head.length; i++){
            int my=weights[i];
            int cnt=0;
            int cnt1=weights.length;
            int heavy=0;
            String temp[]=head2head[i].split("");
            for(int j=0; j<temp.length; j++){
                if(temp[j].equals("N")){
                    cnt1-=1;
                }
                else if(temp[j].equals("W")){
                    if(my<weights[j]){
                        heavy++;
                    }
                    cnt++;
                }
            }
            if(cnt1==0){
                wincount[i]=0;
            }
            else {
                wincount[i] = ((double) cnt / (double) cnt1) * 1000000;
                wincount[i] = Double.parseDouble(form.format(wincount[i]));
            }
            heavys[i]=heavy;
        }

        ArrayList<Player> a1= new ArrayList<>();
        for(int i=0; i<weights.length; i++){
            a1.add(new Player(wincount[i],heavys[i],weights[i],i));
        }



        Collections.sort(a1, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.score==o2.score){
                    if(o1.heavy==o2.heavy){
                        if(o1.weight==o2.weight){
                            return o1.num-o2.num;
                        }
                        return o2.weight-o1.weight;
                    }
                    return o2.heavy-o1.heavy;

                }
                return (int)(o2.score-o1.score);
            }
        });
        int rank[]=new int[weights.length];
        Arrays.fill(rank,1);
        for(int i=0; i<a1.size(); i++){
            rank[i]+=a1.get(i).num;

        }
        return rank;
    }
}
