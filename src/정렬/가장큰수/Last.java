package 정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;
class Last {
    public String solution(int[] numbers) {
        String number[]=new String[numbers.length];
        for(int i=0; i<number.length; i++){
            number[i]=Integer.toString(numbers[i]);
        }

        Arrays.sort(number, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        String answer="";
        for(int i=0; i<number.length; i++){
            if(answer.length()==0 && number[i].equals("0")){
                if(i==number.length-1){
                    answer+=numbers[i];
                }
                else{
                    continue;
                }
            }
            else{
                answer+=number[i];
            }
        }

        return answer;
    }
}
