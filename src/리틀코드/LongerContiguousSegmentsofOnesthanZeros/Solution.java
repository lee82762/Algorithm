package 리틀코드.LongerContiguousSegmentsofOnesthanZeros;

class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0;
        int zero=0;
        int cntone=0;
        int cntzero=0;
        String s1[]=s.split("");
        for(int i=0; i<s1.length; i++){
            if(s1[i].equals("1")){
                cntone++;
                zero=Math.max(zero,cntzero);
                cntzero=0;
            }
            else if(s1[i].equals("0")){
                one=Math.max(cntone,one);
                cntone=0;
                cntzero++;
            }
            if(i==s1.length-1){

                zero=Math.max(zero,cntzero);
                one=Math.max(cntone,one);
            }

        }

        if(one>zero){
            return true;
        }
        else{
            return false;
        }

    }
}