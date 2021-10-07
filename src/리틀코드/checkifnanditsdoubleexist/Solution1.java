package 리틀코드.checkifnanditsdoubleexist;

import java.util.HashSet;

class Solution1 {
    public boolean checkIfExist(int[] arr) {
        HashSet<String> s1=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(s1.contains(String.valueOf(arr[i]))){
                return true;
            }

            if(arr[i]%2==0){
                s1.add(String.valueOf(arr[i]*2));
                s1.add(String.valueOf(arr[i]/2));
            }
            else{
                s1.add(String.valueOf(arr[i]*2));
            }

        }

        return false;
    }
}
