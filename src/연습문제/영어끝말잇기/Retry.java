package 연습문제.영어끝말잇기;

import java.util.ArrayList;
class Retry {
    public int[] solution(int n, String[] cities) {
        int answer[]=new int[2];
        ArrayList<String>temp=new ArrayList<>();

        for(int i=0; i<cities.length; i++){
            if(temp.isEmpty()){
                temp.add(cities[i]);
            }
            else {
                if (temp.contains(cities[i])) {
                    answer[0]=(i % n) + 1;
                    answer[1]=(i / n)+1;
                    break;
                }
                else{
                    temp.add(cities[i]);
                }
            }

            if(i!=0){
                String prelast=cities[i-1].substring(cities[i-1].length()-1,cities[i-1].length());
                String nextfirst=cities[i].substring(0,1);
                if(!prelast.equals(nextfirst)){
                    answer[0]=(i % n) + 1;
                    answer[1]=(i / n)+1;
                    break;
                }
            }
        }
        return answer;
    }
}
