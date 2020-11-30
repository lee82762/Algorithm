package 순열조합.조합알고리즘;


//조합알고리즘
public class Solution {
    private static int sum=0;
    private  static int total=100;
    public static void main(String arg[]){
        int []arr={20,7,23,19,10,15,25,8,13};

        int n=arr.length;
        int []output=new int[n];

        boolean []visited=new boolean[n];


        combination(arr, output,visited, 0, n, 7);
    }
    static void combination(int[] arr,int []output, boolean[] visited, int start, int n, int r) {
        if (r == 0) {



            for (int i = 0; i < n; i++) {
                if (visited[i]) {

                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println(" ");


            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            sum=sum+arr[i];

            combination(arr,output, visited, i + 1, n, r - 1);
            sum=sum-arr[i];
            visited[i] = false;
        }
    }
    

}

