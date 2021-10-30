package NHN.문제2번;

import java.util.HashSet;
import java.util.Scanner;
//텔레포트 정거장
public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static int answer=0;

    public static void testCase(int caseNum)
    {

        int N= scanner.nextInt();
        int M= scanner.nextInt();

        HashSet<String>set=new HashSet<>();
        String number[]=new String[N];
        for(int i=0; i<N; i++){
            number[i]=scanner.next();
        }
        for(int i=0; i<N; i++){

            set.add(number[i]);
            if(set.size()==M){
                answer=i+1;
                break;
            }
        }
        System.out.println(answer);

    }

    public static void main(String[] args)
    {   //프로그램의 시작부
        int tn = scanner.nextInt(); //테스트케이스의 수를 입력받는다
        for(int caseNum = 1 ; caseNum <= tn ; caseNum++)
        {   //테스트케이스의 수 만큼 반복 수행한다
            testCase(caseNum);
        }
    }
}