package 힙.이중우선순위큐;

import java.util.Comparator;
import java.util.PriorityQueue;
class Retry {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer>min=new PriorityQueue<>();
        PriorityQueue<Integer>max=new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<operations.length; i++){
            String s[]=operations[i].split(" ");
            if(s[0].equals("I")){
                max.add(Integer.parseInt(s[1]));
                min.add(Integer.parseInt(s[1]));
            }
            else if(s[0].equals("D") && s[1].equals("1")){
                if(max.size()>0) {
                    int max1 = max.poll();
                    min.remove(max1);
                }
            }
            else{
                if(max.size()>0) {
                    int min1 = min.poll();
                    max.remove(min1);
                }
            }


        }
        int answer[]=new int[2];
        if(!max.isEmpty() && !min.isEmpty()){
            answer[0]=max.poll();
            answer[1]=min.poll();
        }
        return answer;
    }
}
