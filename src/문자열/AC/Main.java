package 문자열.AC;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    static int T;
    static String p;
    static int n;
    static String arr;
    static ArrayDeque<String> s1=new ArrayDeque<>();
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int k=0; k<T; k++) {
            p = sc.next();
            n = sc.nextInt();
            arr = sc.next();
            if (n == 0) {
                if(p.contains("D"))
                    System.out.println("error");
                else
                    System.out.println("[]");
                continue;

            } else {

                arr = arr.substring(1, arr.length() - 1);
                String[] arr1 = arr.split(",");

                for (int i = 0; i < arr1.length; i++) {
                    s1.add(arr1[i]);
                }

                boolean check = true;

                for (int i = 0; i < p.length(); i++) {
                    char c = p.charAt(i);

                    if (c == 'R') {
                        check = !check;
                        continue;
                    } else {
                        if (s1.isEmpty()) {
                            System.out.println("error");
                            break;
                        } else {
                            if (check == true) {
                                s1.removeFirst();
                            } else {
                                s1.removeLast();
                            }
                        }

                    }
                }
                if (!s1.isEmpty()) {


                    if (check == false) {
                        System.out.print("[");
                        while (s1.size() != 1) {
                            System.out.print(s1.removeLast() + ",");
                        }
                        System.out.print(s1.removeLast());
                        System.out.println("]");
                    } else {
                        System.out.print("[");
                        while (s1.size() != 1) {
                            System.out.print(s1.removeFirst() + ",");
                        }
                        System.out.print(s1.removeFirst());
                        System.out.println("]");

                    }
                }
            }

            s1.clear();
        }




    }

}

