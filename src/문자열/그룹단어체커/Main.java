package 문자열.그룹단어체커;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int answer=0;
        for(int i=0; i<N; i++){
            String s[]=sc.next().split("");
            String tm=s[0];
            HashSet<String>set=new HashSet<>();
            set.add(s[0]);
            boolean check=true;
            for(int j=1; j<s.length; j++){
                if(!set.contains(s[j]) && !tm.equals(s[j])){
                    set.add(s[j]);
                    tm=s[j];
                }
                else if(set.contains(s[j]) && tm.equals(s[j])){
                    continue;
                }
                else if(set.contains(s[j]) && !tm.equals(s[j])){
                    check=false;
                    break;
                }
            }
            if(check==true){
                answer++;
            }
        }
        System.out.println(answer);

    }
}
