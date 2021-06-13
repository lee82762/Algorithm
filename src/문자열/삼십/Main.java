package 문자열.삼십;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static ArrayList<Integer>a1=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int []arr=new int[s.length()];
        int sum=0;
        boolean chek=false;
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
            sum+=arr[i];
            if(arr[i]==0)
                chek=true;
        }

        Arrays.sort(arr);
        if(sum%3==0&&chek==true){
            for(int i=arr.length-1; i>=0; i--){
                System.out.print(arr[i]);
            }
        }
        else{
            System.out.println("-1");
        }




    }
}
