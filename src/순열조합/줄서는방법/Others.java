package 순열조합.줄서는방법;

import java.util.ArrayList;

//모든 순열을 구하지 않고  k번째의 배열만 구하는 방식
//모든 순열의 갯수는 n!개이다.
//그중 k번째의 순열의 첫번째 숫자를 구하는 방식
//이후 반복
class Others {


    public int[] solution(int n, long k) {
        ArrayList<Integer>a1=new ArrayList<>();

        long fac=1;
        for(int i=1; i<=n; i++){
            a1.add(i);
            fac*=i;
        }
        //인덱스를 찾는 것이기 때문에  k--를 해준다
        k--;

        int answer[]=new int[n];
        int idx=0;

        while (n>0){
            //전체 팩토리얼에서 n을 나눈값 = slice (첫번째 수가 올 수 있는 숫자의 배열 갯수)
            fac/=n;

            answer[idx++]=a1.get((int)(k/fac)); //n까지 저정된 리스트에서 k를 fac로 나눈 것이 첫번째 숫자가 올 수 있는 리스트의 값

            a1.remove((int)(k/fac)); //한번쓴 값은 리스트에서 제거한다.

            k%=fac; //첫번째수를 제외한 그다음 k번째 숫자를 구하기 위해서

            n--;
        }
        return answer;

    }


}
