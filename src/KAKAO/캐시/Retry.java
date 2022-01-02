package KAKAO.캐시;

import java.util.*;
class Retry {
    public int solution(int casheSize, String[] cities) {
        LinkedList<String>list=new LinkedList<>();
        int answer=0;
        if(casheSize==0){
            answer=5*cities.length;
            return answer;
        }
        for(int i=0; i<cities.length; i++){
            String temp=cities[i].toLowerCase();
            if(list.size()<casheSize){
                if(list.contains(temp)){
                    list.remove(temp);
                    answer+=1;
                }
                else{
                    answer+=5;
                }
                list.add(temp);

            }
            else{
                if(list.contains(temp)){

                    answer+=1;
                    list.remove(temp);
                    list.add(temp);
                }
                else{

                    answer+=5;
                    list.removeFirst();
                    list.add(temp);
                }

            }
        }

        return answer;
    }
}
