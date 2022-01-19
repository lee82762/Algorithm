package 리틀코드.spiralmatrix;

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i=0;
        int j=0;
        int cnt=0;
        int a=0;


        List<Integer> a1=new ArrayList<>();
        while (true) {
            if(cnt==matrix.length*matrix[0].length){
                break;
            }
            for (int k = 0; k < matrix[0].length-a; k++) {
                a1.add(matrix[i][j]);
                j++;
                cnt++;
            }
            i++;
            j--;
            a++;
            if(cnt==matrix.length*matrix[0].length){
                break;
            }
            for (int k = 0; k < matrix.length - a; k++) {
                a1.add(matrix[i][j]);
                i++;
                cnt++;
            }
            i--;
            j--;
            if(cnt==matrix.length*matrix[0].length){
                break;
            }

            for (int k = 0; k < matrix[0].length - a; k++) {
                a1.add(matrix[i][j]);
                j--;
                cnt++;
            }
            j++;
            i--;
            a++;
            if(cnt==matrix.length*matrix[0].length){
                break;
            }
            for (int k = 0; k < matrix.length - a; k++) {
                a1.add(matrix[i][j]);
                i--;
                cnt++;
            }
            if(cnt==matrix.length*matrix[0].length){
                break;
            }
            i++;
            j++;
        }
        return a1;

    }
}
