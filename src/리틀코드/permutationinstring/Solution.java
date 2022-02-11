package 리틀코드.permutationinstring;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        int x=s1.length();
        int y=s2.length();

        for(int i=0; i<x; i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }

        for(int i=x; i<y; i++){
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            arr2[s2.charAt(i-x)-'a']--;
            arr2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}
