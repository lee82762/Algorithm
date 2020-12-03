package KAKAO.비밀지도1차;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String []s1=new String[n];
        String []s2=new String[n];
        for(int i=0; i<arr1.length; i++){
            s1[i]=Integer.toBinaryString(arr1[i]);
            s2[i]=Integer.toBinaryString(arr2[i]);
        }
        for(int i=0; i<n; i++){
            while (s1[i].length()!=n){
                s1[i]="0"+s1[i];
            }
            while (s2[i].length()!=n){
                s2[i]="0"+s2[i];
            }
        }
        String []answer=new String[n];
        for(int i=0; i<n; i++){
            String re="";
            for(int j=0; j<n; j++){
                char c=s1[i].charAt(j);
                char c1=s2[i].charAt(j);
                if(c=='0'&&c1=='0'){
                    re+=" ";
                }
                else{
                    re+="#";
                }
            }
            answer[i]=re;
        }
        return answer;
    }
}
