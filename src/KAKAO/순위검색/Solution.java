package KAKAO.순위검색;
//정확도 : 100 효율 : 0
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] info, String[] query) {
        int answer[]=new int[query.length];

        for(int i=0; i<query.length; i++){
            query[i]=query[i].replace(" and "," ");
            query[i]=query[i].replace("-","");


            String q1[]=query[i].split(" ");
            ArrayList<String>s1=new ArrayList<>();



            for(int  k=0; k<q1.length; k++) {
                //System.out.println("qu=" +k+" "+ q1[k]);
                for(int j=0; j<info.length; j++){
                    String q2[]=info[j].split(" ");
                    for (int t=k; t<k+1; t++){
                        //System.out.println(q2[t]);
                        if(k==0){
                            if(q1[k].equals(q2[t])||q1[k].equals("")){
                                s1.add(Integer.toString(j));
                            }
                        }
                        else if(k==4){
                            if(Integer.parseInt(q1[k])>Integer.parseInt(q2[t])){
                                s1.remove(Integer.toString(j));
                            }
                        }
                        else{
                            if(s1.contains(Integer.toString(j))&&q1[k].equals(q2[t])||q1[k].equals("")){
                                continue;
                            }
                            else{
                                s1.remove(Integer.toString(j));

                            }
                        }
                    }
                }


            }
            answer[i]=s1.size();
            s1.clear();

        }
        return answer;
    }
}