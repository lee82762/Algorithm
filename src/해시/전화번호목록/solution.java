package 해시.전화번호목록;

import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);
        boolean answer=true;
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i].length()<phone_book[i+1].length()){
                if(phone_book[i].substring(0,phone_book[i].length()).equals(phone_book[i+1].substring(0,phone_book[i].length()))){
                    answer=false;
                    break;
                }
            }
            else{
                if(phone_book[i].substring(0,phone_book[i+1].length()).equals(phone_book[i+1].substring(0,phone_book[i+1].length()))){
                    answer=false;
                    break;
                }

            }


        }
        return answer;
    }
}