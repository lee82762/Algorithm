package 연습문제.영어끝말잇기;

import java.util.ArrayList;
class Last {
    static ArrayList<String>temp=new ArrayList<>();
    public int[] solution(int n, String[] words) {
        int answer[]=new int[2];
        temp.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(check(words[i-1],words[i])){
                temp.add(words[i]);
            }
            else{
                answer[0]=(i%n)+1;
                answer[1]=(i/n)+1;
                break;
            }
        }
        return answer;
    }
    static public boolean check(String first,String last){
        boolean ans=true;
        if(temp.contains(last)){
            return false;
        }
        if(first.charAt(first.length()-1)!=last.charAt(0)){
            return false;
        }
        return ans;
    }
}
