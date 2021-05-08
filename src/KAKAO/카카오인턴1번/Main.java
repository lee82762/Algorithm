package KAKAO.카카오인턴1번;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        String s="one4seveneight";
        String answer="";
        String s1="";
        ArrayList<String>s2=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)==false){
                s1+=String.valueOf(c);
                if(s1.equals("one")){
                    s2.add("1");
                    s1="";
                }
                else if(s1.equals("two")){
                    s2.add("2");
                    s1="";
                }
                else if(s1.equals("three")){
                    s2.add("3");
                    s1="";
                }
                else if(s1.equals("four")){
                    s2.add("4");
                    s1="";
                }
                else if(s1.equals("five")){
                    s2.add("5");
                    s1="";
                }
                else if(s1.equals("six")){
                    s2.add("6");
                    s1="";
                }
                else if(s1.equals("seven")){
                    s2.add("7");
                    s1="";
                }
                else if(s1.equals("eight")){
                    s2.add("8");
                    s1="";
                }
                else if(s1.equals("nine")){
                    s2.add("9");
                    s1="";
                }
                else if(s1.equals("zero")){
                    s2.add("0");
                    s1="";
                }
            }
            else{
                s2.add(String.valueOf(c));

            }
        }

        for(int i=0; i<s2.size(); i++){
            answer+=s2.get(i);
        }

        int answer2=Integer.parseInt(answer);

    }
}




