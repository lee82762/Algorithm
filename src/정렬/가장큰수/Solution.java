package 정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        Arrays.sort(numbers);

        String []c=new String[numbers.length];

        for(int i=0; i<numbers.length; i++){

            c[i]=Integer.toString(numbers[i]);
        }
        Arrays.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        String answer="";
        if (c[0].equals("0")) return "0";

        for(int i=0; i<c.length; i++){
            answer+=c[i];
        }

        return answer;
    }
}
