package KAKAO.비밀지도1차;

class Retry {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String answer[]=new String[n];

        for(int i=0; i<arr1.length; i++){
            String ar1=Integer.toBinaryString(arr1[i]);
            String ar2=Integer.toBinaryString(arr2[i]);
            while (ar1.length()!=n){
                ar1="0"+ar1;
            }
            while (ar2.length()!=n){
                ar2="0"+ar2;
            }
            String temp="";
            for(int j=0; j<ar1.length(); j++){
                char c=ar1.charAt(j);
                char c1=ar2.charAt(j);
                if(c=='1' || c1=='1'){
                    temp+="#";
                }
                else{
                    temp+=" ";
                }
            }
            answer[i]=temp;
        }
        return answer;
    }
}