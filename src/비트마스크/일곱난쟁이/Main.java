package 비트마스크.일곱난쟁이;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp[]=new int[9];
        for(int i=0; i<9; i++){
            temp[i]=sc.nextInt();
        }
        ArrayList<Integer> re =new ArrayList<>();

        for(int i=0; i<(1<<9); i++){
            if(Integer.bitCount(i)==7){
                int result=0;
                for(int j=0; j<9; j++){
                    if(((1<<j)&i)>0){
                        result+=temp[j];
                        re.add(temp[j]);
                    }
                }
                if(result==100){
                    break;
                }
                else{
                    re.clear();
                }
            }
        }
        Collections.sort(re);
        for(int i=0; i<re.size(); i++){
            System.out.println(re.get(i));
        }

    }
}
