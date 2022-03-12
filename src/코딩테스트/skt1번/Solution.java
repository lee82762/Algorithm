package 코딩테스트.skt1번;
import java.util.*;
class Solution {
    public int solution(int money, int[] costs) {
        int me[]={1,5,10,50,100,500};
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0; i<costs.length; i++){
            map.put(me[i],costs[i]);
        }
        ArrayList<Integer>a1=new ArrayList<>(map.keySet());
        Collections.sort(a1,(o1, o2) -> map.get(o1).compareTo(map.get(o2)));
        System.out.println(a1);
        int result=0;
        int temp=0;
        int answer=0;
        boolean check =false;
        for(int i=costs.length-1; i>=0; i--){
            temp=money/me[i];
            result=(map.get(me[i])*temp);


            if(result>=money ){
                temp=0;
                result=0;
            }
            else{
                check=true;
                money = money % me[i];
                answer+=result;
            }

        }
        return answer+money;
    }
}
