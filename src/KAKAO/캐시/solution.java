package KAKAO.캐시;

import java.util.ArrayList;
class Solution {
    public int solution(int cacheSize, String[] cities) {

        ArrayList<String>re=new ArrayList<>();
        int answer=0;
        if(cacheSize==0){
            answer=cities.length*5;
        }
        else {



            for(int i=0; i<cities.length; i++){
                cities[i]=cities[i].toLowerCase();
                if(re.size()<cacheSize){
                    if(re.contains(cities[i])){
                        re.remove(cities[i]);
                        re.add(cities[i]);
                        answer+=1;
                    }
                    else {
                        re.add(cities[i]);
                        answer += 5;
                    }
                }
                else{
                    if(re.contains(cities[i])){
                        re.remove(cities[i]);
                        re.add(cities[i]);
                        answer+=1;
                    }
                    else{
                        re.remove(0);
                        re.add(cities[i]);
                        answer+=5;
                    }

                }
            }
        }

        return answer;
    }
}
