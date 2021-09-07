package 문자열.토스삼번;

public class Solution {
        public static void main(String[] args) {
            String amountText="1000,010";
            int cnt=0;
            boolean check=true;
            boolean answer=true;
            for(int i=amountText.length()-1; i>=0; i--){
                char c=amountText.charAt(i);
                cnt++;
                if(amountText.length()!=1){
                    if(i==0){
                        if(c=='0'||c==','){
                            answer= false;
                        }
                    }
                    else if(i==amountText.length()-1){
                        if(c==','){
                            answer=false;
                        }
                    }
                }
                else if (amountText.length()==1){
                    if(c==','){
                        answer=false;
                    }

                }


                if(Character.isDigit(c)){

                }
                else{
                    if(check==false){
                        System.out.println("D");
                        if(cnt%4==0){
                            if(c!=','){
                                answer=false;
                            }
                        }
                    }
                    if(c==','){
                        check=false;
                        if(cnt%4==0){
                            continue;
                        }
                        else{
                            answer= false;
                        }
                    }
                    else{
                        answer= false;
                    }
                }
            }
            System.out.println(answer);

        }

}
