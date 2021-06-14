package 문자열.비밀번호발음하기;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if(s.equals("end")){
                break;
            }

            if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")) {
                boolean check = true;
                int cnt = 0;
                int cnt1 = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c[] = s.toCharArray();
                    if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                        cnt1 = 0;
                        cnt++;
                        if (cnt == 3) {
                            check = false;
                            break;
                        }
                    } else {
                        cnt = 0;
                        cnt1++;
                        if (cnt1 == 3) {
                            check = false;
                            break;
                        }
                    }
                }

                if (check == true) {
                    for (int i = 1; i < s.length(); i++) {
                        char c[] = s.toCharArray();
                        if (c[i] == c[i - 1]) {
                            if (c[i] == 'e' || c[i] == 'o') {
                                continue;
                            } else {
                                check = false;
                                break;
                            }
                        }

                    }

                    if (check == true) {
                        System.out.println("<" + s + "> is acceptable.");
                    } else {
                        System.out.println("<" + s + "> is not acceptable.");
                    }
                } else {
                    System.out.println("<" + s + "> is not acceptable.");
                }
            } else {
                System.out.println("<" + s + "> is not acceptable.");

            }
        }


    }
}
