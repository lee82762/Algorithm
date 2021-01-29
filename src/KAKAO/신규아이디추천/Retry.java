package KAKAO.신규아이디추천;

class Retry {
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();

        //2단계
        String temp="";

        for(int i=0; i<new_id.length(); i++){
            char c=new_id.charAt(i);
            if(c>='a'&&c<='z'||c>='0'&&c<='9'||c=='-'||c=='_'||c=='.'){
                temp+=c;
            }
        }


        //3단계
        String answer = "";
        if(temp.length()<=1){
            answer=temp;
        }
        else {
            for (int i = 0; i < temp.length(); i++) {
                char[] c = temp.toCharArray();
                if (i == temp.length() - 1) {
                    answer += c[i];
                }
                else {
                    if (c[i] == '.' && c[i + 1] == '.') {
                        continue;
                    } else if (c[i] == '.' && c[i + 1] != '.') {
                        answer += c[i];
                    }
                    else {
                        answer += c[i];
                    }
                }
            }
        }


        //4단계
        String first="";
        String last="";
        if(answer.length()==0){
            answer="";
        }
        if(answer.length()==1){
            first=answer.substring(0,1);
            if(first.equals(".")){
                answer=answer.substring(1,answer.length());
            }
        }
        else{
            first=answer.substring(0,1);
            last=answer.substring(answer.length()-1,answer.length());
            if(first.equals(".")){
                answer=answer.substring(1,answer.length());
            }
            if(last.equals(".")){
                answer=answer.substring(0,answer.length()-1);
            }

        }



        //5단계
        if(answer.isEmpty()){
            answer="a";
        }


        //6단계
        if(answer.length()>=16){
            answer=answer.substring(0,15);
            last=answer.substring(answer.length()-1,answer.length());
            if(last.equals(".")){
                answer=answer.substring(0,answer.length()-1);
            }
        }


        //7단계
        last=answer.substring(answer.length()-1,answer.length());

        if(answer.length()<=2){
            while (true){
                answer+=last;
                if(answer.length()==3){
                    break;
                }
            }

        }
        return answer;
    }
}
