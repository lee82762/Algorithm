package KAKAO.방금그곡3차;

class Retry {
    public String solution(String m, String[] musicinfos) {

        m=m.replace("C#","c");
        m=m.replace("D#","d");
        m=m.replace("F#","f");
        m=m.replace("G#","g");
        m=m.replace("A#","a");


        String answer="";
        int cnt=0;
        for(int i=0; i<musicinfos.length; i++){
            String []s1=musicinfos[i].split(",");
            int an=0;
            for(int j=0; j<1; j++){
                int hour=Integer.parseInt(s1[j+1].split(":")[j])-Integer.parseInt(s1[j].split(":")[j]);
                int  min=Integer.parseInt(s1[j+1].split(":")[j+1])-Integer.parseInt(s1[j].split(":")[j+1]);
                an=hour*60+min;
            }
            s1[3]=s1[3].replace("C#","c");
            s1[3]=s1[3].replace("D#","d");
            s1[3]=s1[3].replace("F#","f");
            s1[3]=s1[3].replace("G#","g");
            s1[3]=s1[3].replace("A#","a");

            int j=0;
            int len=s1[3].length();
            String anw="";
            for(int k=0; k<an; k++){
                j=k%len;
                anw+=s1[3].charAt(j);
            }

            if(!anw.contains(m)){
                continue;
            }
            if(an>cnt){
                answer=s1[2];
                cnt=an;
            }
        }
        if(answer.equals("")){
            answer="(None)";
        }
        return answer;
    }
}