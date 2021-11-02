package 리틀코드.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> s1=new ArrayList<>();
        for(int i=1; i<=n; i++){
            String s="";
            if(i%3==0&&i%5==0){
                s1.add("FizzBuzz");
            }
            else if(i%3==0){
                s1.add("Fizz");
            }
            else if(i%5==0){
                s1.add("Buzz");
            }
            else{
                s1.add(Integer.toString(i));
            }

        }
        return s1;

    }
}
