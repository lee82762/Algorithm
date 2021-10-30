package NHN.문제1번;


import java.util.ArrayList;
import java.util.Scanner;
//텔레포트 정거장
public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt(); // 송수신 기록의 수
        String[] logs = new String[n]; // 송수신 기록
        for(int i = 0 ; i < n ; i ++)
        {

            String s = scanner.next();
            String s1=scanner.next();
            logs[i]=s+" "+s1;

        }
        ArrayList<String> answer=new ArrayList<>();
        for(int i=0; i<logs.length; i++) {
            String s="";
            String number="";
            if(logs[i].length()==17){
                s = logs[i].substring(0, 3);
                number=logs[i].substring(4,17);
            }
            else {
                s = logs[i].substring(0, 4);
                number=logs[i].substring(5,18);
            }
            int cnt=1;
            for (int j = i+1; j < logs.length; j++) {
                String s1="";
                String number2="";
                if(logs[j].length()==17){
                    s1 = logs[j].substring(0, 3);
                    number2=logs[j].substring(4,17);
                }
                else {
                    s1 = logs[j].substring(0, 4);
                    number2=logs[j].substring(5,18);
                }
                if(s.equals(s1)&&number.equals(number2)){
                    cnt++;
                }
                else{
                    break;
                }
            }
            i=i+(cnt-1);
            String result="";
            if(cnt!=1){
                result+=s+" "+number+" ("+Integer.toString(cnt)+")";
            }
            else{
                result+=s+" "+number;
            }
            answer.add(result);

        }
        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }



    }
}
