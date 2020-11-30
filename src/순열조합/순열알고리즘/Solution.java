package 순열조합.순열알고리즘;

public class Solution {
    public static void main(String arg[]){
        int []arr={1,2,3,4};
        int n=arr.length;
        int r=2;
        boolean []check=new boolean[n];
        int output[]=new int[n];
        for(int i=1; i<=n; i++){
            // dfs(arr,output,check,0,n,i);
        }
        dfs(arr,output,check,0,n,r);


    }




    private static void dfs(int []arr, int []output,boolean []check, int dept, int n, int r){

        String answer="";
        if(dept==r){
            for(int i=0; i<r; i++) {

                answer += Integer.toString(output[i]);
                System.out.println(output[i]);



            }
            //System.out.println(answer);

            return;
        }
        for(int i=0; i<n; i++){
            if(check[i]!=true){
                //System.out.println("i="+i);
                //System.out.println("dept="+dept);
                output[dept]=arr[i];
                check[i]=true;
                dfs(arr,output,check,dept+1,n,r);
                check[i]=false;
            }
            System.out.println(" ");
        }
    }

}
