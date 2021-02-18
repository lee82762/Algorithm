package 정렬.암기왕;

//통과 X 이분탐색을 사용해서 다시풀기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    static StringBuilder sb = new StringBuilder();


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int test = Integer.parseInt(st.nextToken());
        int n,m;


        for(int i = 0; i < test; i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            st = new StringTokenizer(br.readLine());
            ArrayList<Integer>a1=new ArrayList<>();
            for(int j = 0; j < n; j++){
                int num = Integer.parseInt(st.nextToken());
                map.put(num,1);
            }


            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                int num = Integer.parseInt(st.nextToken());
                if(map.containsKey(num)){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }

        }
    }
}
