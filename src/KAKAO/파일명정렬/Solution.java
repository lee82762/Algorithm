package KAKAO.파일명정렬;

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] files) {

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a1="";
                for(int i=0; i<o1.length(); i++){
                    char c[]=o1.toCharArray();
                    a1+=c[i];
                    if(Character.isDigit(c[i+1])){
                        break;
                    }

                }
                // System.out.println(a1);
                String b1="";
                for(int i=0; i<o2.length(); i++){
                    char c[]=o2.toCharArray();
                    b1+=c[i];
                    if(Character.isDigit(c[i+1])){
                        break;
                    }

                }
                // System.out.println(b1);
                int result=a1.toLowerCase().compareTo(b1.toLowerCase());
                //System.out.println(result);
                if(result==0){
                    o1=o1.replace(a1,"");
                    o2=o2.replace(b1,"");
                    String a2="";
                    String b2="";
                    for(int i=0; i<o1.length(); i++){
                        char c=o1.charAt(i);
                        if(Character.isDigit(c)&& a2.length()<5){
                            a2+=c;
                        }
                        else{
                            break;
                        }
                    }
                    for(int i=0; i<o2.length(); i++){
                        char c=o2.charAt(i);
                        if(Character.isDigit(c)&& b2.length()<5){
                            b2+=c;
                        }
                        else{
                            break;
                        }
                    }
                    result=Integer.parseInt(a2)-Integer.parseInt(b2);

                }
                return result;
            }
        });
        return files;
    }
}
