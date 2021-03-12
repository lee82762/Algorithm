package KAKAO.신규아이디추천;

class Retry1{
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();

        //2단계
        String temp="";
        for(int i=0; i<new_id.length(); i++){
            char c=new_id.charAt(i);
            if(c=='-'||c=='_'||c=='.'||c>='0'&&c<='9'||c>='a'&&c<='z'){
                temp+=c;
            }
        }



        //3단계
        String temp1="";
        for(int i=0; i<temp.length(); i++){
            char c[]=temp.toCharArray();
            if(i==temp.length()-1){
                temp1+=c[i];
                continue;
            }
            if(c[i]=='.'&&c[i+1]!='.'){
                temp1+=c[i];
            }
            else if(c[i]=='.'&&c[i+1]=='.'){
                continue;
            }
            else{
                temp1+=c[i];
            }
        }


        if(temp1.substring(0,1).equals(".")){
            temp1=temp1.substring(1,temp1.length());
        }
        if(temp1.length()>=1) {
            if (temp1.substring(temp1.length() - 1, temp1.length()).equals(".")) {
                temp1 = temp1.substring(0, temp1.length() - 1);
            }
        }


        if(temp1.length()==0){
            temp1+="a";
        }


        if(temp1.length()>=16){
            temp1=temp1.substring(0,15);
        }
        if(temp1.substring(temp1.length()-1,temp1.length()).equals(".")){
            temp1=temp1.substring(0,temp1.length()-1);
        }

        String re=temp1.substring(temp1.length()-1,temp1.length());
        if(temp1.length()<=2){
            while (true){
                temp1+=re;
                if(temp1.length()==3){
                    break;
                }
            }
        }
        return temp1;
    }
}