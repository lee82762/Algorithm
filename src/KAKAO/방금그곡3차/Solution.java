package KAKAO.방금그곡3차;

class Solution {
    public String solution(String m, String[] musicinfos) {
        m=m.replace("D#","d");
        m=m.replace("F#","f");
        m=m.replace("G#","g");
        m=m.replace("C#","c");
        m=m.replace("A#","a");
        String answer="(None)";
        int len=0;

        for(int i=0; i<musicinfos.length; i++){
            String []s1=musicinfos[i].split(",");
            int an=0;


            int hour = Integer.parseInt(s1[1].split(":")[0]) - Integer.parseInt(s1[0].split(":")[0]);
            int minute = Integer.parseInt(s1[1].split(":")[1]) - Integer.parseInt(s1[0].split(":")[1]);
            an = hour * 60 + minute;



            for(int j=2; j<s1.length; j++){
                s1[j]=s1[j].replace("A#","a");
                s1[j]=s1[j].replace("D#","d");
                s1[j]=s1[j].replace("C#","c");
                s1[j]=s1[j].replace("G#","g");
                s1[j]=s1[j].replace("F#","f");

            }

            int j=0;
            String s="";

            for(int h=0; h<an; h++){//an번반복
                j=h%s1[3].length();
                s+=s1[3].charAt(j);
            }



            if(!s.contains(m)){
                continue;
            }
            if ( an > len) {
                answer = s1[2];
                len = an;
            }
        }


        return answer;
    }
}
