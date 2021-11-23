package KAKAO.방금그곡3차;

class Retry1 {
    public String solution(String m, String[] musicinfos) {

        m=m.replace("C#","c");
        m=m.replace("D#","d");
        m=m.replace("F#","f");
        m=m.replace("G#","g");
        m=m.replace("A#","a");
        String answer="";
        int max=0;
        for(int i=0; i<musicinfos.length; i++){
            String info[]=musicinfos[i].split(",");

            String start[]=info[0].split(":");
            String end[]=info[1].split(":");
            int hour=Integer.parseInt(end[0])-Integer.parseInt(start[0]);
            int min=Integer.parseInt(end[1])-Integer.parseInt(start[1]);
            int result=hour*60+min;

            info[3]=info[3].replace("C#","c");
            info[3]=info[3].replace("D#","d");
            info[3]=info[3].replace("F#","f");
            info[3]=info[3].replace("G#","g");
            info[3]=info[3].replace("A#","a");
            String music[]=info[3].split("");
            String s="";
            for(int k=0; k<result; k++){
                s+=music[k%music.length];
            }

            if(!s.contains(m)){
                continue;
            }
            if(result>max){
                answer=info[2];
                max=result;
            }
        }
        if(answer.equals("")){
            answer="(None)";
        }
        return answer;
    }
}