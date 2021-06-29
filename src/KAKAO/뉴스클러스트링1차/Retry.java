package KAKAO.뉴스클러스트링1차;

import java.util.ArrayList;
class Retry {
    public int solution(String str1, String str2) {
        str1= str1.toLowerCase();
        str2=str2.toLowerCase();
        String re="^[a-z]+$";
        ArrayList<String>s1=new ArrayList<>();
        ArrayList<String>s2=new ArrayList<>();

        for(int i=0; i<str1.length()-1; i++){
            String s=str1.substring(i,i+2);
            if(s.matches(re)){
                s1.add(s);
            }
        }

        for(int i=0; i<str2.length()-1; i++){
            String s=str2.substring(i,i+2);
            if(s.matches(re)){
                s2.add(s);
            }
        }
        ArrayList<String>s3=new ArrayList<>();
        ArrayList<String>s4=new ArrayList<>();
        for(int i=0; i<s1.size(); i++){
            s3.add(s1.get(i));
        }
        for(int i=0; i<s2.size(); i++){
            s4.add(s2.get(i));
        }

        ArrayList<String>gu=new ArrayList<>();
        for(int i=0; i<s1.size(); i++){
            if(s2.contains(s1.get(i))){
                gu.add(s1.get(i));
                s2.remove(s1.get(i));
            }
        }
        System.out.println(gu);
        ArrayList<String>hap=new ArrayList<>();
        for(int i=0; i<s3.size(); i++){
            hap.add(s3.get(i));
            if(s4.contains(s3.get(i))) {
                s4.remove(s3.get(i));
            }
        }
        hap.addAll(s4);
        int anw=0;
        if(gu.size()!=0&&hap.size()!=0) {
            double answer = (double) gu.size() / (double) hap.size();
            anw = (int) (answer * 65536);
        }
        else if(gu.size()==0&&hap.size()==0){
            anw=65536;
        }
        else if(hap.size()==0){
            anw=0;
        }
        return anw;
    }
}
