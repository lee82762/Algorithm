package DP.투자의귀재;

//답은 올바르게 나오는데 오류 (재귀로 하면 오류 발생)
//9일때 3년+3년+3년 > 5년+3년+1년 이므로 오류발생!!!
//점화식으로 풀어볼것
import java.util.Scanner;

public class Main {
    static int H;
    static  int Y;
    static  int arr[];

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        H=sc.nextInt();
        Y=sc.nextInt();


        while (true) {
            int a=(int)(H*0.05);
            int b=(int)(H*0.2);
            int c= (int) (H*0.35);
            if(Y==0){
                System.out.println(H);
                break;
            }
            if(Y%5==0){
                H=H+c;
                Y-=5;
            }
            else if(Y%3==0){
                H=H+b;
                Y-=3;
            }
            else {
                H += a;
                Y -= 1;

            }
        }
    }




}








