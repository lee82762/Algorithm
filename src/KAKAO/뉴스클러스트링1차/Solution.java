package KAKAO.뉴스클러스트링1차;

import java.util.ArrayList;
class Solution {
    public int solution(String str1, String str2) {
        // 정규 표현식
        String re="^[a-z]+$";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();


        ArrayList<String>s1=new ArrayList<>();
        ArrayList<String>s2=new ArrayList<>();
        // 정규 표현식 조건에 맞게 리스트 대입
        for(int i=0; i<str1.length()-1; i++){
            String []c=str1.split("");
            String ch=c[i]+c[i+1];
            if(ch.matches(re)){
                s1.add(ch);
            }
            else{
                continue;
            }
        }


        for(int i=0; i<str2.length()-1; i++){
            String []c=str2.split("");
            String ch=c[i]+c[i+1];
            if(ch.matches(re)){
                s2.add(ch);
            }
            else{
                continue;
            }
        }
        //교집합을 위한 새로운 리스트
        ArrayList<String>ss1=new ArrayList<>();
        ArrayList<String>ss2=new ArrayList<>();
        for(int i=0; i<s1.size(); i++){
            ss1.add(s1.get(i));
        }
        for(int i=0; i<s2.size(); i++){
            ss2.add(s2.get(i));
        }

        //교집합= ss2 리스트에 ss1 요소가 있으면 교집합에 더하고 ss2에서 해당원소 제거
        ArrayList<String>gu=new ArrayList<>();
        for(int i=0; i<ss1.size(); i++){
            if(ss2.contains(ss1.get(i))){
                gu.add(ss1.get(i));
                ss2.remove(ss1.get(i));
            }
        }


        //합집합=s1의 모든 값을 넣다가 만약 s2에 s1의 요소가 있으면 s2에서 제거
        //그 후 남은 s2의 모든 원소 hap리스트에 넣어주기.
        ArrayList<String>hap=new ArrayList<>();

        for(int i=0; i<s1.size(); i++){
            hap.add(s1.get(i));
            if(s2.contains(s1.get(i))){
                s2.remove(s1.get(i));
            }
        }

        hap.addAll(s2);


        int  answer=0;
        //교집합 합집합 둘다 0 일때
        if(gu.size()==0&&hap.size()==0){
            answer=65536;
        }
        //교집합이 0이면 answer=0;
        else if(gu.size()==0){
            answer=0;
        }
        else{
            double re1=(double)gu.size()/(double)hap.size();
            answer= (int) (re1*65536);

        }
        return answer;
    }
}
