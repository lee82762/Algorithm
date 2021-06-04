package 문자열.누울자리를찾아라;

import java.util.Scanner;

public class Main {

    static int  N;
    static String arr[][];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new String[N][N];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){
                arr[i][j]=String.valueOf(s.charAt(j));
            }
        }

        int raro=0;
        int sero=0;

        for(int i=0; i<N; i++){
            String re="";
            for(int j=0; j<N; j++){
                if(arr[i][j].equals(".")){
                    re+=".";
                }
                else {
                    if(re.length()>=2){
                        raro++;
                    }
                    re="";
                }
            }
            if(re.length()>=2){
                raro++;
            }
        }

        int cnt=0;
        while (true){
            if(cnt==N){
                break;
            }
            String s="";
            for(int i=0; i<N; i++){
                if(arr[i][cnt].equals(".")){
                    s+=".";
                }
                else{
                    if(s.length()>=2){
                        sero++;
                    }
                    s="";
                }
            }
            if(s.length()>=2){
                sero++;
            }
            cnt++;
        }
        System.out.println(raro+" "+sero);






    }
}