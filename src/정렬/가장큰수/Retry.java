package 정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;
class Retry {
    public String solution(int[] numbers) {
        String []st=new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            st[i]=Integer.toString(numbers[i]);
        }
        //문자크기에 정렬
        Arrays.sort(st, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        String answer="";
        //첫번째 값이 0이면
        if (st[0].equals("0")) return "0";

        for(int i=0; i<st.length; i++){

            answer+=st[i];

        }

        return answer;
    }
}
