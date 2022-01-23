package 그리디.수들의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long S=sc.nextLong();
        long temp=0;
        int count=0;
        for(int i=1; i<=S; i++){
            temp+=i;
            count++;
            if(temp>S){
                break;
            }
        }
        System.out.println(count-1);
    }
}
